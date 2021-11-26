package oops;

class PersonDetails{
	int id;
	String name;
	
	public PersonDetails() {
		System.out.println("Person constr invoked");
		this.id = 100;
		this.name="Joel Henz";
	}
	
	public PersonDetails(int id, String name) {
		System.out.println("Person constr invoked");
		this.id = id;
		this.name=name;
	}
	
	public void displayDetails() {
		System.out.println("id = "+this.id+", name = "+this.name);
	}
	
	public void personMethodOnly() {
		
	}
}

class EmployeeDetails extends PersonDetails{
	float salary;
	String company;
	
	public EmployeeDetails() {
		//here a implicit super() constructor call is made by compiler because we did not make
		//other constructor than default
		System.out.println("employee constr invoked");
		this.salary=12000;
		this.company="simpli";
	}
	
	public EmployeeDetails(int id, String name, float salary, String company) {
		super(id, name);
		System.out.println("employee constr invoked");
		this.salary=salary;
		this.company=company;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("salary = "+this.salary+", company = "+this.company);
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDetails emp = new PersonDetails();
		emp.displayDetails();
		System.out.println();
		
		emp = new EmployeeDetails();
		emp.displayDetails();
		System.out.println();
		
		PersonDetails emp2 = new EmployeeDetails();
		emp2.displayDetails();
		emp2.personMethodOnly(); //is also accessible

	}

}
