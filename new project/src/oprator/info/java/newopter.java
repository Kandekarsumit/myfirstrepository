package oprator.info.java;

public class newopter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 newopter obj=new  newopter();
		obj.greaterthanequalto(19,9);
		obj.lessthanequalto(16, 4);
		obj.notequalto(9,90);
		 
	}
public void greaterthanequalto(int a,int b) {
	System.out.println("a is greaterthan b?" + (a>=b));
	
}
public void lessthanequalto(int a,int b) {
	System.out.println("a is lessthan b?" + (a<=b));
}
public void notequalto(int a,int b) {
System.out.println("a is equalto b?" + (a!=b));
}
}
	


