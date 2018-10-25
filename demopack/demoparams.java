package demopack;

public class demoparams {

	public static void main(String[] args) {
	System.out.println("begining");
	two t2=new two();
	t2.add(10, 40);
	t2.sub(100, 200);
	t2.add(1, 4);
	t2.add();
	t2.add(1);

	}
}
class two {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Total of "+a+" and "+b+" is: "+c);
		
	}
	public void add() {
		System.out.println("polymorphism");
		
	}
	public void add(int a) {
		System.out.println("signle variable"+a);
	}
	
	public void sub(int a,int b) {
		int d=b-a;
		System.out.println(d);
	}
	
}
   