package demopack;

public class demooverload {
	public static void main (String[] args) {
		System.out.println("Zahid");
		six s1=new six();
		s1.add(30, 40);
		s1.add(10, 30, 50);
		s1.add(40, 10, null);
		s1.bangalore();
		
	}

}
class six{
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	} 
 public void add(int a,int b,int c) {
	int d = a+b+c;
	System.out.println(d);
  }
 public void add(int a,int b, String msg) {
		int c = a+b;
		System.out.println("Total is: " +c);
	}
 public void bangalore() {
	 System.out.println("bangalore city");
    }
}