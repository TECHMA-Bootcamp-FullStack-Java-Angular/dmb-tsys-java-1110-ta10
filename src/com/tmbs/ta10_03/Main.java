package com.tmbs.ta10_03;

public class Main {

	public static void main(String[] args)  {
		
		System.out.println("\nGenerandor Exepción par o impar");
		
		try {

			throw new ParInpar();

		} catch (ParInpar e) {

			System.out.println(e.getMessage());
		}
	}
}
