package com.tmbs.ta10_03;

import java.util.Random;

public class ParInpar extends Exception{
	
	private static Random numRandom = new Random();
	private static Integer num = numRandom.nextInt(999);
	
	public ParInpar() {
		
	}
	
	@Override
	public String getMessage() {
		return (num%2==0)
				?"\nExcepcion es Par ID: " + num
				:"\nExcepcion es Impar ID: " + num;
	}
	
	private static final long serialVersionUID = 1L;
	
}
