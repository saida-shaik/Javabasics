package demopack;

public class demoinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Begining of inheritance");
 	Nine N1=new Nine();
 	Ten T1=new Ten();
 	Eleven E1=new Eleven();
 	N1.bangalore();
 	N1.chennai();
 	N1.Hyderabad();
	}

}
class Nine extends Ten{
	public void bangalore() {
		System.out.println("This is bangalore");
	}
}
class Ten{
	public void chennai() {
		System.out.println("this is chennai");
	}
	public void Hyderabad() {
		System.out.println("this is Hyderabad");
	}
}
class Eleven{
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
		}
