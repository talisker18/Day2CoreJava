package models;

class Sports extends Marks{
	float score;
	
	public void acceptDetails() { //needs to be public because we call it in InheritanceMain, by Result obj
		//and since we do not have this method in Result class
		super.acceptDetials();
		System.out.print("enter score: ");
		this.score = super.scan.nextFloat(); //dont make new scanner, use it from parent class
	}
	
	public void displayDetails() { //same as acceptDetails()
		super.displayDetails(); 
		System.out.println("score is: "+this.score);
	}
}
