package demopack;

public class Demostring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.displayEmpName(); 
		emp1.displayAge();
		emp1.firstName = "Saida";
		emp1.Age = 30;
		emp1.displayEmpName(); 
		emp1.displayAge();
	}
}

class Employee {
	//Properties or variable
	public String firstName;
	public int Age;
	//Constructor
	Employee() {
		this.firstName = "Zahid";
		this.Age = 5;
	}
	// Method
	public void displayEmpName() {
		System.out.println("Hello your Name is: " +firstName );
	}
	public void displayAge() {
		System.out.println("Hello your Age is: " +Age );
	}
}