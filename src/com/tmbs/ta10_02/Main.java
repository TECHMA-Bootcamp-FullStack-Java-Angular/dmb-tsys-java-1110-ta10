package com.tmbs.ta10_02;

public class Main {

	public static void main(String[] args) {

		try {

			throw new MyException("Lanzamos la excepción");

		} catch (MyException ex) {

			System.out.println(ex.getMessage());
		}

	}

}
