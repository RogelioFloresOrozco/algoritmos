package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFactorial 
{

	public static void main(String[] args) 
	{
		int res=1;
		int num=0;
		boolean ban=true;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero que quieras hacer factorial");
		num = teclado.nextInt();
		
		for(int cont=num; cont>0;cont--)
		{
		    res = res*cont;
		    
		    if(ban==true)
		    {
		    	System.out.print(num+"!=");
		    }
		    if(cont>1)
		    {
		    	System.out.print(cont+"x");
		    }
		    if(cont==1)
		    {
		    	System.out.print(cont+"= "+res);
		    }
		    
		ban=false;
		}
		

	}
}


