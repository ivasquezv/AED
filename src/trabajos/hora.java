package trabajos;
import java.util.*;

public class hora {
	
	Scanner teclado = new Scanner(System.in);
	int num;
	int seg;
	int min;
	int hor;

	public hora(){
		
	}
	
	public void ingrese_segundos(){
		 
        System.out.println("ingrese los segundos ");  
        num=teclado.nextInt();
        while(num<3600 || num>90000){
        	System.out.println("ingrese un cantidad válida de segundos");
        	num=teclado.nextInt();
        }
	 }
    public void dime_la_hora(){
    	
    	 hor=num/3600;  
         min=(num-(3600*hor))/60;  
         seg=num-((hor*3600)+(min*60));  
         System.out.println(hor+"h "+min+"m "+seg+"s");  
         
	}
}
