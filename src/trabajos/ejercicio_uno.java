package trabajos;
import java.util.*;

public class ejercicio_uno {
	
	int num1;
	int num2;
	int resultado;
	Scanner teclado = new Scanner(System.in);
	
	public ejercicio_uno(){	
		
	}
	
	public void ingrese_num1(){
		System.out.println("Ingrese el primer numero:");
		num1=teclado.nextInt();
	}
	
	public void ingrese_num2(){
		System.out.println("Ingrese el segundo numero:");
		num2=teclado.nextInt();
	}
	
	public void suma(){
		resultado=num1+num2;
	}
	
	public void muestra_suma(){
		System.out.println("la suma es:"+resultado);
		
	}
	
	public void resta(){
		resultado=num1-num2;
	}
	
	public void muestra_resta(){
		System.out.println("la resta es:"+resultado);
	}
	
	 public void num1_par_impar(){
		 		 
		 if(num1%2==0){
			 System.out.println("el numero "+ num1 +" es par");
		 }
		 else{
			 System.out.println("el numero "+ num1 +" es impar");
		 }
	 }
	 
	 public void num2_par_impar(){
		 
		 if (num2%2==0) {
			System.out.println("el numero "+ num2 +" es par");
		}
		 else{
			 System.out.println("el numero "+ num2 +" es impar");
		 }
	 }

}

