package trabajos;
import java.util.*;

public class ej_base_exponente {
	
	Scanner teclado = new Scanner(System.in);
	int a;
	int b;
	double base;
	double exponente;
	int resultado;
	
	int suma;
	

	public ej_base_exponente(){
		
		suma=1;
	}
	
	public void ingresar_numeros(){
		
		//En el ejercicio pidió ingresar numeros enteros, entonces transforme los datos de tipo int
		//ingresado por teclado a double, multiplicando por 1.0
		System.out.println("Ingrese el número base:");
		a=teclado.nextInt();
		base=a*1.0;
		System.out.println("Ingrese el número exponencial:");
		b=teclado.nextInt();
		exponente=b*1.0;
		
	}
	
	public void operacion(){
		
		//el método pow devuelve un tipo de dato double, entonces utilizamos la refundición, agregando
		//el(int) antes de Math.pow
		resultado=(int)Math.pow(base, exponente);
		System.out.println("El resultado de " +a+"^"+b+ " :" + resultado);
	}
	
	public void obtener_factorial(){
		
		if(a<=b){
			for(int i=a;i>1;i--){
				suma=suma*i;
			}
			System.out.println("El factorial de " +a+"! es:"+suma);
		}
	}
	
	
	
}
