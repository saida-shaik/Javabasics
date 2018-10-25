package demopack;

public class democonstructionoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is construction overload ");
		Eight E1=new Eight();
		Eight E2=new Eight(10,20);
		Eight E3=new Eight(20,30,40);
		E2.bangalore();
	}

}
class  Eight {
		Eight(){
		System.out.println("this is first eights");	
	}
	Eight(int E,int F) {
		int D=E+F;
		System.out.println(D);
	}
	Eight(int a,int b,int c) {
		int g=a+b+c;
		System.out.println(g);
	}
	public void bangalore() {
		System.out.println("this is whitefield");
	}
}
