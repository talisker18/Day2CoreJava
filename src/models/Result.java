package models;

public class Result extends Sports{
	private float totalMarks;
	private float averageMarks;
	
	public void calculate() {
		//instead of super, you can use this. as well
		this.totalMarks = super.objectiveMarks + super.subjectiveMarks + super.score;
		this.averageMarks = this.totalMarks / 3;
		
		if(
				super.objectiveMarks > 70 && 
				super.subjectiveMarks > 70 && 
				super.score > 70 && 
				this.averageMarks >=75
				) {
			System.out.println("you are selected");
		}else {
			System.out.println("you are rejected");
		}
	}
}
