package trabajos;
import java.util.*;

/* Crear un programa que solicite 3 numeros cualquiera, y retornelos ordenados de menor a mayor,
 * como restricción al ingresar los números éstos no pueden ser iguales	*/


public class ej_mayor_menor {
	
	Scanner teclado = new Scanner(System.in);
	int num_uno;
	int num_dos;
	int num_tres;
	int mayor;
	int medio;
	int menor;
	
	
	public ej_mayor_menor(){
		
	}
	
	public void ingresar_numeros(){
		
		System.out.println("Ingrese el primer número :");
		num_uno=teclado.nextInt();
		System.out.println("Ingrese el segundo número :");
		num_dos=teclado.nextInt();
		while(num_uno==num_dos){
		System.out.println("Se ingresaron números iguales, ingrese un número váilido");
		num_dos=teclado.nextInt();
		}
		System.out.println("Ingrese el tercer número :");
		num_tres=teclado.nextInt();
		while(num_tres==num_dos || num_tres==num_uno){
		System.out.println("Se ingresaron números iguales, ingrese un número váilido");
		num_tres=teclado.nextInt();
		}
	}
	
	public void mostrar_numeros(){
		
		int [] numeros = new int [3];
		numeros[0] = num_uno;
		numeros[1] = num_dos;
		numeros[2] = num_tres;
		
		for(int n:numeros){
			System.out.println(n);
		}
	}

	public void mayor(){
		
		if(num_uno>num_dos && num_uno>num_tres){
			
			System.out.println("el mayor es "+num_uno);
			mayor=num_uno;
		}
		else if(num_dos>num_uno && num_dos>num_tres){
			
			System.out.println("el mayor es "+num_dos);
			mayor=num_dos;
		}
		else{
			
			System.out.println("el mayor es "+num_tres);
			mayor=num_tres;		
		}	
	}
		public void menor(){
		
		if(num_uno<num_dos && num_uno<num_tres){
			System.out.println("el menor es "+num_uno);
			menor=num_uno;
		}
		else if(num_dos<num_uno && num_dos<num_tres){
			System.out.println("el menor es "+num_dos);
			menor=num_dos;
		}
		else{
			System.out.println("el menor es "+num_tres);
			menor=num_tres;
		}			
	}	
		
		public void medio(){
			
			medio = (num_uno+num_dos+num_tres)-(mayor+menor);
			System.out.println("el medio es "+medio);
		}
		
		public void ordenados_menor_a_mayor(){
			
		 int orden [] = new int [3];
		 
		 orden[0]=menor;
		 orden[1]=medio;
		 orden[2]=mayor;
		 
		 for(int o:orden){
			 System.out.println(o);	 
		 }
		 
	}
		
}
	
	

