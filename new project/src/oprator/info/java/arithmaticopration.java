package oprator.info.java;

public class arithmaticopration {

	public static void main(String[] args) {
	
		arithmaticopration obj = new arithmaticopration();
		obj.add(2, 03);
		obj.sub(3, 1);
		obj.multi(2, 4);
		arithmaticopration.div(15, 3);
		arithmaticopration.moduls(5);
	}
public void add(int a,int b){

	System.out.println("This is + oprator test" + (a+b));
}
public void sub( int a, int b){
	System.out.println("This is - oprator test" + (a-b));
}
public void multi( int a, int b) {
	System.out.println("This is * oprator test" + (a*b));
}
public static void div( int a, int b) {
	System.out.println("This is / oprator test" + (a/b));
}
public static void moduls( int a) {
	System.out.println("This is % oprator test" + (a%3));
}


}