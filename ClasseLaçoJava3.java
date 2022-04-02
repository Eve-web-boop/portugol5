package PacoteJava;

import java.util.Scanner;

public class ClasseLaçoJava3 {
	
	public static void main(String args[])
	{
		int idade;
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.println("\nDigite sua idade: ");
		 idade=leia.nextInt();
		
		 if (idade >=10 && idade <=14) {
			 System.out.println("\nInfantil");
		 }
		 else if (idade >=15 && idade <=17) {
			 System.out.println("\nJuvenvil");
		 }
		 else if (idade >=18 && idade <=25) {
			 System.out.println("\nAdulta");
		 }
		 else {
			 System.out.println("\nVocê não se enquadra em nenhuma das opções");
		 }	
		
	}

}
