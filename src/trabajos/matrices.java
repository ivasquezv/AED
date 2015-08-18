package trabajos;
import java.util.*;

public class matrices {
	int i;
	int n;
	Scanner teclado= new Scanner(System.in);
	int [] matriz = new int [4];
	
	
	public matrices(){
		
	}
	
	public void crea_matriz(){
		
		for(i=0;i<=3;i++){
			System.out.println("ingrese numero "+(i+1));
			n=teclado.nextInt();
			while(n%2==0){
				System.out.println("de nuevo");
				n=teclado.nextInt();
			}
			matriz[i]=n;
		}
		
	}
	
	public void mostrar_matriz(){
		
		for(i=0;i<=3;i++){
			System.out.print(matriz[i] + " - ");
		}
	}
	
	
}
