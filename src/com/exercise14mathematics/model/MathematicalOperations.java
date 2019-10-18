package com.exercise14mathematics.model;


public class MathematicalOperations 
{
	final double PI=3.1416;

	public static double areaTriangle(double base,double height)
	{
		return (base*height)/2;
	}
	
	public double areaSquare(double side)
	{
		return side*side;
	}
	
	public double areaCircle(double radio)
	{
		return this.PI*(radio*radio);
	}
	
}
