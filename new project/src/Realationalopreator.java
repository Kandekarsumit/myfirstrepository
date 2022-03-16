
public class Realationalopreator {

	public static void main(String[] args) {
		
		Realationalopreator obj=new Realationalopreator();
		obj.greaterthan(2,1);
		obj.lessthan(3, 4);
		obj.equalto(4,4);
		 
	}
public void greaterthan(int a,int b) {
	System.out.println("a is greaterthan b?" + (a>b));
	
}
public void lessthan(int a,int b) {
	System.out.println("a is lessthan b?" + (a<b));
}
public void equalto(int a,int b) {
System.out.println("a is equalto b?" + (a==b));
}
}