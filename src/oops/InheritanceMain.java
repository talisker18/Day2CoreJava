package oops;

import java.util.Scanner;

import models.Result;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r1 = new Result();
		r1.acceptDetails(); //we do not have this method in Result, so we need it from Sports
		r1.displayDetails();//we do not have this method in Result, so we need it from Sports
		
		r1.calculate();

	}

}
