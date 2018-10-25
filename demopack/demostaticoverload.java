package demopack;

public class demostaticoverload {
	public static void main(String[] args) {
		seven.add(100, 1000);
		seven.add(100, 100, 100);
		//seven s7=new seven();
		//s7.staticoverload();
		seven.staticoverload();
		
	}

}
class seven{
	public static void add(int L,int M) {
		int K=L+M;
		System.out.println(K);
	}
	public static void add(int P,int Q,int R) {
		int S=P+Q+R;
		System.out.println(S);
		
		}
	public static void staticoverload() {
		System.out.println("This is static overload");
	}
}