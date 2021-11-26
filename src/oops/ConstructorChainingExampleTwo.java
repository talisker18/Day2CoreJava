package oops;

class Calculation{
	public Calculation() {
		this(100); //call second constr from here
		System.out.println("default constr");
	}
	
	public Calculation(int a) {
		this(a,100); //call third constr from here
		System.out.println("second constr");
	}
	
	public Calculation(int a, int b) {
		System.out.println("third constr");
	}
}

public class ConstructorChainingExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calc = new Calculation(); //first call is third constructor

	}

}
