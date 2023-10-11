package com.tmbs.ta10_05;

public class Main {

	public static void main(String[] args) {

		int arraySize = Password.askValueNumeric("\nDame el valor del tamaño del array: ");
		int passSize = Password.askValueNumeric("Dime el tañaño del la Password: ");

		Password passList[] = new Password[arraySize];
		boolean esFuerteList[] = new boolean[arraySize];

		int index = 0;

		Password.hr();

		for (Password password : passList) {

			password = new Password(passSize);

			esFuerteList[index] = password.esFuerte();

			System.out.println(password.getPass() + " es fuerte: " + esFuerteList[index]);
			Password.hr();
			++index;
		}

	}

}
