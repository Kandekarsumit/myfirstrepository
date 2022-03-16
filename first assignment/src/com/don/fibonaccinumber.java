package com.don;

public class fibonaccinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,c,i,d=10;

for(i=2;i<=d;i++) {
	c=a+b;
	System.out.println("fibonacci number"+c);
	a=b;
	b=c;
	
}
	}

}
