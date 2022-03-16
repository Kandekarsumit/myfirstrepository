package oprator.info.java;

public class unaryoprater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unaryoprater obj=new unaryoprater();
		obj.positive(5);
		obj.negative(-5);
	}
private void positive(int a) {
	System.out.println("i am oprter to represent positive"+(+a));
	
}
private void negative(int a) {
	System.out.println("i am oprter to represent negative"+(-a));
}
}