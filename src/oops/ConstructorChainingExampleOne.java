package oops;

class Person{
	int id;
	String name;
	
	public Person() {
		System.out.println("Person constr invoked");
		this.id = 100;
		this.name="Joel Henz";
	}
	
	public Person(int id, String name) {
		System.out.println("Person constr invoked");
		this.id = id;
		this.name=name;
	}
	
	public void displayDetails() {
		System.out.println("id = "+this.id+", name = "+this.name);
	}
}

class Employee extends Person{
	float salary;
	String company;
	
	public Employee() {
		//here a implicit super() constructor call is made by compiler because we did not make
		//other constructor than default
		System.out.println("employee constr invoked");
		this.salary=12000;
		this.company="simpli";
	}
	
	public Employee(int id, String name, float salary, String company) {
		super(id, name);
		System.out.println("employee constr invoked");
		this.salary=salary;
		this.company=company;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("salary = "+this.salary+", company = "+this.company);
	}
}

public class ConstructorChainingExampleOne {
	
	public static void main(String[] args) {
		Employee emp = new Employee(40, "joel", 10000,"google");
		emp.displayDetails();
	}
	
	
}
