package PacoteJava;

import java.util.Scanner;

public class ClasseLa�oJava1 {
     public static void main(String args[])
     {
    	 int n1, n2, n3, Maior;
    	 
    	 Scanner leia = new Scanner(System.in);
    	 
    	 System.out.println("\nPrimeiro n�mero: ");
    	 n1=leia.nextInt();
    	 System.out.println("\nSegundo n�mero: ");
    	 n2=leia.nextInt();
    	 System.out.println("\nTerceiro n�mero:");
    	 n3=leia.nextInt();
    	 
    	 if(n1>n2){
    		 if(n1>n3)
    		 {Maior=n1;}
    		 	else {Maior=n3;}
    		 } 
    	 		else {
    		 if(n2>n3) 
    		 {Maior=n2;}
    			 
    			else {Maior=n3;}
    			
    	 	 }
    	 
    	 System.out.println("\nO maior n�mero �: "+Maior);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
