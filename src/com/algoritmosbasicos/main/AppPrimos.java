package com.algoritmosbasicos.main;
import java.util.Scanner;
public class AppPrimos 
{

	public static void main(String[] args) 
	{
		int iNum=0;
		boolean isPrimo=false;
		char cres=' ';
		Scanner entrada = new Scanner(System.in);
		do
		{
			isPrimo=false;
			System.out.println("Dame un numero");
			iNum=entrada.nextInt();
			
			for(int cont=2;cont<iNum;cont++)
			{
				if(iNum%cont == 0 && isPrimo==false)
				{
					isPrimo=true;
					System.out.println("el numero introducido no es primo");
				}
			
			if(isPrimo==false)
			{
				System.out.println("el numero introducido es primo");
			}
			}
			System.out.println("quieres vollver a intentarlo s/n");
			cres=entrada.next().charAt(0);
		
		}while(cres=='s' || cres=='S');
		
}
		
	}


