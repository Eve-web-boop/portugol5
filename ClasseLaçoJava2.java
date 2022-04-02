package PacoteJava;

import java.util.Scanner;

public class ClasseLaçoJava2 {

public static void main(String args[])
{
	 int n1, n2, n3;
	 
	 Scanner leia = new Scanner(System.in);
	 
	 System.out.println("\nPrimeiro número: ");
	 n1=leia.nextInt();
	 System.out.println("\nSegundo número: ");
	 n2=leia.nextInt();
	 System.out.println("\nTerceiro número:");
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

