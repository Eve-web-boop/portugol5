package PacoteJava;

import java.util.Scanner;

public class ClasseIntrodu��oJava1 {
     public static void main(String args[])
     {
    	 int dia, mes, ano, idadeD;
    	 
    	 Scanner leia = new Scanner(System.in);
    	 
    	 System.out.println("\nDigite sua idade em anos meses e dias: \nAnos");
    	 ano=leia.nextInt();
    	 System.out.println("\nMeses: ");
    	 mes=leia.nextInt();
    	 System.out.println("\nDias:");
    	 dia=leia.nextInt();
    	 
    	 ano=365 * ano;
    	 mes=30 * mes;
    	 idadeD= ano + mes + dia;
    	 
    	 System.out.println("\nVoc� tem o total de: "+ idadeD +"dias de vida");
    	 
    	 
    	 
    	 
}
}