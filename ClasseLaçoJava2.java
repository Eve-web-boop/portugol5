package PacoteJava;

import java.util.Scanner;

public class ClasseLa�oJava2 {

public static void main(String args[])
{
	 int n1, n2, n3;
	 
	 Scanner leia = new Scanner(System.in);
	 
	 System.out.println("\nPrimeiro n�mero: ");
	 n1=leia.nextInt();
	 System.out.println("\nSegundo n�mero: ");
	 n2=leia.nextInt();
	 System.out.println("\nTerceiro n�mero:");
	 n3=leia.nextInt();
	 
	 
	 if(n1<=n2 && n2<=n3)
		{
			System.out.println("\nOrdem crescente:"+n1+" , "+n2+" , "+n3);
		}
		else if(n1<=n3 && n3<=n2)
		{
			System.out.println("\nOrdem crescente:"+n1+" , "+n2+" , "+n2);
		}
		else if(n2<=n1 && n1<=n3)
		{
			System.out.println("\nOrdem crescente:"+n2+" , "+n1+" , "+n3);
		}
		else if(n2<=n3 && n3<=n1)
		{
			System.out.println("\nOrdem crescente:"+n2+" , "+n3+" , "+n1);
		}
		else if(n3<=n1 && n1<=n2)
		{
			System.out.println("\nOrdem crescente:"+n3+" , "+n1+" , "+n2);
		}
		else
		{
			System.out.println("\nOrdem crescente:"+n3+" , "+n2+" , "+n1);
		}
	}

}

