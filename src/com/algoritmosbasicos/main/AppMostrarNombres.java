package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppMostrarNombres 
{

	public static void main(String[] args) 
	{
		String sNombre="";
		int cont2=0;
		
		Scanner entrada = new Scanner(System.in);
		
		//--------------- ciclo for-------------------
		System.out.println("Dame tu nombre");
		sNombre = entrada.nextLine();
		
		for(int cont=0; cont<10;cont++)
		{
			System.out.println("Hola "+ sNombre+" "+ cont);
		}
		
		//----------------ciclo while-------------------
		
		System.out.println("Dame tu nombre");
		sNombre = entrada.nextLine();
		while (cont2<10)
		{
			
		System.out.println("Que onda "+ sNombre+ " "+cont2);
		cont2++;
		}
		
		//-------------------ciclo do while------------------
		cont2=0;
		System.out.println("Dame tu nombre");
		sNombre = entrada.nextLine();
		do
		{
			
			System.out.println("Que onda "+ sNombre+ " "+cont2);
			cont2++;
		
		}while(cont2<10);
			
		
	}

}
