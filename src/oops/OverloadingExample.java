package oops;

class Calculator{
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	/*
	public float addition(int a, int b) { //does not work, same params as above -> different return type is not enough
		return a+b;
	}*/
	
	public float addition(float a, float b) { //this works, different params
		return a+b;
	}
	
	public float addition(float a, int b) { //this works, different params
		return a+b;
	}
	
	public float addition(int a, float b) { //this works, different params
		return a+b;
	}
	
	public float addition(float a, float b, float c) { //this works, different params
		return a+b+c;
	}
	
	//another example:
	//print statement, it takes once boolean, once string, once int etc as param
	
}

public class OverloadingExample {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result= calc.addition(100, 200);
	}
}
