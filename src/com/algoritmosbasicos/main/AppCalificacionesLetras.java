package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppCalificacionesLetras {

	public static void main(String[] args) {
		char iLetra=' ';
		char res=' ';
		String cadena;
		
		Scanner teclado = new Scanner(System.in);
		do {
				System.out.println("Escribe una letra de la A-F");
				cadena=teclado.next();
				iLetra=cadena.charAt(0);
				System.out.println("La letra introducida :"+iLetra);
				
				switch(iLetra)
				{
				case 'A':
				case 'a': System.out.println("Tienes 10");
				break;
				case 'B':
				case 'b': System.out.println("Tienes 9");
				break;
				case 'C':
				case 'c': System.out.println("Tienes 8");
				break;
				case 'D':
				case 'd': System.out.println("Tienes 7");
				break;
				case 'E':
				case 'e': System.out.println("Tienes 6");
				break;
				case 'F':
				case 'f': System.out.println("Tienes 5");
				break;
				default: System.out.println("Calificacion no valida");
				
				}
				
				System.out.println("Quieres volver a capturar(S/N)?");
				cadena=teclado.next();
				res=cadena.charAt(0);
			
		}while(res=='s'|| res=='S');
	}

}
