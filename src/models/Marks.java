package models;

class Marks extends Student{
	float objectiveMarks;
	float subjectiveMarks;
	//Scanner scan = new Scanner(System.in); -> we do not need scanner again in child class
	
	
	public void acceptDetials() {
		super.acceptDetials(); //first create student
		System.out.print("enter objective marks: ");
		this.objectiveMarks= scan.nextFloat();
		//scan.nextLine(); //we need this line
		
		System.out.print("enter subjective marks: ");
		this.subjectiveMarks=scan.nextFloat();
	}
	
	public void displayDetails() {
		super.displayDetails(); 
		System.out.println("objective marks: "+this.objectiveMarks);
		System.out.println("subjective marks: "+this.subjectiveMarks);
	}
}
