package com.tmbs.ta10_05;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Password {
	
	static Scanner sc = new Scanner(System.in);
	private int longitud;
	private String pass;
	
	private final int LOGN_DEF=8; 
	
	public Password() {
		this.longitud =  LOGN_DEF;
		this.pass = generarPassword(this.longitud);
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.pass = generarPassword(this.longitud);
	}

	
    protected boolean esFuerte() {

        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        
        for (char caracter : pass.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        return (mayusculas > 2) && (minusculas > 1) && (numeros >= 5);
    }
	
	private String generarPassword(int longitud) {
		
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] pass = new char[longitud];
		Random randchar = new Random();

		for (int i = 0; i < longitud; i++) {
			pass[i] = caracteres.charAt(randchar.nextInt(caracteres.length()));
		}

		return new String(pass);	
	}

	public int getLongitud() {
		return longitud;
	}

	public String getPass() {
		return pass;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	static Integer askValueNumeric(String txt) {
		Integer res = 0;

		while (res <= 0) {

			System.out.print(txt);
			String resString = sc.next();

			try {
				res = Integer.valueOf(resString);
			} catch (NumberFormatException nfe) {
				System.err.println("Debes introducir un número valido");
			}
		}
		return res;
	}
	
	public static void hr() {
		System.out.println("\033[36m" + "----------------------------------------------------------" + "\u001B[0m");
	}
}
