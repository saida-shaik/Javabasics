package demopack;

public class Democonstructor {

	public static void main(String[] args) {
		int storeAddition;
		System.out.println("This is chittoor");
		four f4=new four();
		
		storeAddition = f4.add(10, 20);
		System.out.println("Result of Addition: "+ storeAddition);
		
		if(storeAddition >= 20) { 
			System.out.println(f4.add(storeAddition, storeAddition));
		}
	}

}
class four{
	four(){
		System.out.println("This is Doha");
	}
	public int add(int a, int b) {
		return a+b;
	}
}

  //above program is constructor program :three important properties
  // constructor name and class name will be same.
 // constructor will be called by default when a object is created to it.
 //it doesnot have return type .