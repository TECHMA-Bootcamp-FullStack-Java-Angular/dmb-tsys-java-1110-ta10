package com.tmbs.ta10_02;

public class MyException extends Exception{
	
	private  String msg;
	
	public MyException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg + "\nExceptión capturada";
	}
	
	private static final long serialVersionUID = 1L;

}
