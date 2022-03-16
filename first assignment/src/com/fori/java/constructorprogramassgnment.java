package com.fori.java;

public class constructorprogramassgnment  {
	public int a;
	int b;
	boolean c;
	static int d ;
	
	
	
public constructorprogramassgnment() {
	
	System.out.println("i am in no parameter constructor");
}
	
	

public constructorprogramassgnment(int a) {
	
	System.out.println("i am in  parameterized constructor");
}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorprogramassgnment xyz=new constructorprogramassgnment();
		xyz=new constructorprogramassgnment(5);
		
	}

}
