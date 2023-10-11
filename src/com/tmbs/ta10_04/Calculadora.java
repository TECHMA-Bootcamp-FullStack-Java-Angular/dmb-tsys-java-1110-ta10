package com.tmbs.ta10_04;

import java.util.Arrays;
import java.util.Scanner;

public class Calculadora {
	
	private static Scanner sc = new Scanner(System.in);
	private static Double num1;
	private static Double num2;
	
	private final static String OPERATIONS[] = {"1 - Sumar","2 - Restar","3 - Dividir","4 - Mutiplicar","5 - Resto","6 - Raiz Cuadrada", "7 - Potecia",};

	public static void run() {
		
		 num1 = askNum("Dame el primer numero: ");
		 num2 = askNum("Dame el Senundo numero numero: ");
		 System.out.println("");
		 Arrays.stream(OPERATIONS).forEach(System.out::println);
		 Integer op =askOP("\nElige una operación: ");
		 System.out.print(calcular(op));
	}
	


	private static Integer askOP(String txt) {
		
		Integer res = 0;

		while (res <= 0) {

			System.out.print(txt);
			String resString = sc.next();

			try {
				res = Integer.valueOf(resString);
			} catch (NumberFormatException e) {
				System.err.println("Debes introducir un numero válido");
			}
		}
		return res;
	}
	private static Double askNum(String txt) {
		
		Double res = 0D;

		while (res <= 0) {

			System.out.print(txt);
			String resString = sc.next();

			try {
				res = Double.valueOf(resString);
			} catch (NumberFormatException e) {
				System.err.println("Debes introducir un numero válido");
			}
		}
		return res;
	}
	
	private static String calcular(Integer op) {
		
		String rta;
		
		try {
			
			switch (op) {
			case 1:
				rta = "Suma :" + (num1 + num2) ;
				break;
			case 2:
				rta = "Resta :" + (num1 - num2) ;
				break;
			case 3:
				rta = "Division :" + (num1 / num2) ;
				break;
			case 4:
				rta = "Multiplicación :" + (num1 * num2) ;
				break;
			case 5:
				rta = "Resto :" + (num1 % num2) ;
				break;
			case 6:
				rta = "Raiz Cuadrada de N1:" + Math.sqrt(num1)+ " y Raiz Cuadrada N2"+ Math.sqrt(num2) ;
				break;
			case 7:
				rta = "Potencia de N1 elevado al N2:" + Math.pow(num1,num2) ;
				break;
			default:
				rta = "El signo introducido no es valido";
				break;
			}
						
		} catch (IllegalArgumentException iae) {
					
			rta = "La operación articmetica no se pudo relizar revise los valores";			
		}
	
		return rta;		
	}
	
}
