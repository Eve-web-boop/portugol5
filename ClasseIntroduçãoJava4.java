package PacoteJava;

import java.util.Scanner;

public class ClasseIntrodu??oJava4 {


public static void main(String[] args) {
	// TODO Auto-generated method stub

	double a,b,c,d;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nEntre com o primeiro n?mero: ");
	a = leia.nextDouble();
	System.out.println("\nEntre com o segundo n?mero: ");
	b = leia.nextDouble();
	System.out.println("\nEntre com o terceiro n?mero: ");
	c = leia.nextDouble();
	
	d = (Math.pow((a+b),2) + Math.pow((b+c),2)) / 2;
	System.out.println("\nO valor de D ?: "+d);
}

}


