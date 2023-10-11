package com.tmbs.ta10_01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AcirtaNumero {
	
	private static Scanner sc = new Scanner(System.in);
	private static Integer numberUser;
	private static Integer numberGuess  = (int) (Math.random() * 500);
	private static int attempts = 0;
	

	public static void run() {
	
		System.out.println("\n********************** "+cian("ACIERTA EL NUMERO")+" **********************\n");
				
		do {
			numberUser=AskValueNumeric("Escribe un número del 1 a 500: ");
			
			switch (numberGuess.compareTo(numberUser)) {
			
			case 1:
				System.out.println("El secreto es mayor " );
				break;
			case -1:
				System.out.println("El secreto es memor ");
				break;
			}
			++attempts;
			
		} while (numberGuess.compareTo(numberUser)!=0);
		
		sc.close();
		System.out.println("Bravo has acertado el numero " + numberGuess + " en "+ attempts + " intentos");
			
	}
	

	/**
	 * Imprime texto por consola y comprueba que lo que pase el usuasio sea un número;
	 * 
	 * @param txt
	 * @return
	 */
	private static Integer AskValueNumeric(String txt) {
		Integer num = 0;
		
		while (num <= 0) {
			
			try {
				
				System.out.print(txt);
				num = sc.nextInt();
				
			} catch (InputMismatchException ex) {
				
				System.err.println("Debes colocar un número valido");
				sc.next();
			}

		}
		
		return num;
	}
	
	public static String cian(String text) {
		return "\033[36m" +text+ "\u001B[0m";	   
	}

}
