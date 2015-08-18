package trabajos;
import java.util.*;

public class primos_compuestos {
	
	int x;
	Scanner teclado = new Scanner(System.in);
	
	public primos_compuestos(){
		
		
	}
	
	public void ingresar_numero(){
		
		System.out.println("Ingrese numero");
		x=teclado.nextInt();
	}
	
	public void clasificar(){
		
		if(x==1){
			System.out.println("el numero ingresado no es compuesto");
		}
		else if(x>2){
			
		}
	}
}
