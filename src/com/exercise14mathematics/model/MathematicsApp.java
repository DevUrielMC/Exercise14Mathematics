package com.exercise14mathematics.model;
import com.exercise14mathematics.model.MathematicalOperations;
import java.util.Scanner;

public class MathematicsApp {

	public static void main(String[] args) {
		// Variable declaration
		double base=0;
		double height=0;
		double radio=0;
		double side=0;
		double result=0;
		
		//objects construction
		
		Scanner input= new Scanner(System.in);
		MathematicalOperations myOperations = new MathematicalOperations();
		
		System.out.print("Input de base: ");
		base = input.nextDouble();
		System.out.print("Input the height: ");
		height =input.nextDouble();
		
		 result= MathematicalOperations.areaTriangle(base, height);
		 System.out.print("Ares of the triangle is "+result);
	}

}
