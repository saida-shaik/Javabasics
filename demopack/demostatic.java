package demopack;

public class demostatic {

	public static void main(String[] args) {
		System.out.println("iam saida");
		three.hyderabad();
		three t3=new three();
		t3.chennai();
		t3.hyderabad();

	}
}
class three {
	public static void hyderabad() {
		System.out.println("this is hyderabad");
	}
	public void chennai() {
		System.out.println("this is chennai");
	}
}