package models;

import java.util.Scanner;

class Student{
	private int id; //keep it private because it is not used in child class
	private String name;
	Scanner scan = new Scanner(System.in);
	
	public void acceptDetials() {
		System.out.print("enter id: ");
		this.id= scan.nextInt();
		scan.nextLine(); //we need this line because next input is String? its a bug
		
		System.out.print("enter name: ");
		this.name=scan.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("student id: "+this.id);
		System.out.println("student name: "+this.name);
	}
}
