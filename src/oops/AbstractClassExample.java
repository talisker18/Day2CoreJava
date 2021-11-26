package oops;

abstract class BankAccount{
	
	public abstract void deposit();
	public abstract void withdraw();
	public abstract int balance();
	
	public void parentClassMethodOnly() {
		
	}
}

class BankAccountA extends BankAccount{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int balance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void childClassOnlyMethod() {
		
	}
	
}

public class AbstractClassExample {
	
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccountA();
		acc1.parentClassMethodOnly();
		// acc1.childClassOnlyMethod(); -> this does not work because that method is only
		//in child class and we did an reference type of parent class BankAccount
		
		BankAccountA acc2 = new BankAccountA();
		acc2.parentClassMethodOnly();
		acc2.childClassOnlyMethod();
		
	}
}
