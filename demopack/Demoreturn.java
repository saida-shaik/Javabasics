package demopack;

public class Demoreturn {
	public static void main(String[] args) {
		System.out.println("selenium");
		five f5=new five();
		int D=f5.add(50,50);
		System.out.println(D);
		int S=f5.add(D, D);
		System.out.println(S);
	}

}
class five{	
	public int add(int a,int b) {
		return(a+b);
	}
}