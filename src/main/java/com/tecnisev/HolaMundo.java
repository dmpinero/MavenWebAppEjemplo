package com.tecnisev;

public class HolaMundo 
{
	private int var=0;
	
	public int getVar()
	{
		return var;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		HolaMundo hola = new HolaMundo();
		System.out.println("hola vale:" + hola.var);
	}

}