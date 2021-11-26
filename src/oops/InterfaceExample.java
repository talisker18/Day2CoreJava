package oops;

interface IBank{
	//by default: methods in interfaces are abstract and public
	void deposit();
	void withdraw();
	void balance();
}

interface IManage{
	void openAccount();
	void closeAccount();
	
	default void methodOne() {
		
	}
	
	default void methodTwo() {
		
	}
	
	static void methodThree() {
		
	}
}

class SavingAccount implements IBank, IManage{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAccount() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
