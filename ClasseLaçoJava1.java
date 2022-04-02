package PacoteJava;

import java.util.Scanner;

public class ClasseLaçoJava1 {
     public static void main(String args[])
     {
    	 int n1, n2, n3, Maior;
    	 
    	 Scanner leia = new Scanner(System.in);
    	 
    	 System.out.println("\nPrimeiro número: ");
    	 n1=leia.nextInt();
    	 System.out.println("\nSegundo número: ");
    	 n2=leia.nextInt();
    	 System.out.println("\nTerceiro número:");
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
    	 
    	 System.out.println("\nO maior número é: "+Maior);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
}
