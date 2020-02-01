/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package ioi.java;

/**

 @author Conchraidh
 */
public class arithmeticExample
{
	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		int number1 = 5, number2 = 2;

		double number3 = 5, number4 = 2;

		int additionResult;
		int divisionResult, multiplicationResult, subtractionResult;
		double divisionResult1;

		additionResult = number1 + number2;
		subtractionResult = number1 - number2;
		divisionResult = number1 / number2;
		divisionResult1 = number3 / number4;
		multiplicationResult = number1 * number2;

		System.out.println(number1 + " + " + number2 + " = " + additionResult);
		//System.out.println(number1 + " - " + number2 + " = " + subtractionResult);
		//System.out.println(number1 + " * " + number2 + " = " + multiplicationResult);
		//System.out.println(number1 + " / " + number2 + " = " + divisionResult);
		System.out.println(number3 + " / " + number4 + " = " + divisionResult1);

		int point1 = 2, point2 = 12;
		int midPoint;

		midPoint = (point1 + point2) / 2;

		System.out.println("The midpoint of " + point1 + " and " + point2 + " is " + midPoint);

		double number5 = 2, power = 6;
		double powerAnswer;

		powerAnswer = Math.pow(number5, power);

		//System.out.println("" + number5 + " to the power of " + power + " is " + powerAnswer);
		//System.out.println("The midpoint of " + 5 + " and " + 10 + " is " + MidPoint(5, 10));
		//System.out.println("The midpoint of " + 0 + " and " + 10 + " is " + MidPoint(0, 10));
		//System.out.println("The midpoint of " + 25 + " and " + 50 + " is " + MidPoint(25, 50));
		System.out.println("Average of 1, 2, 3 is " + Average(1, 2, 3));
		System.out.println("Average of 77, 24, 23 is " + Average(77, 24, 23));
		
		PrintName("Санёк Санька");
		PrintName("Дмитри Женя");
	}

	public static int MidPoint(int point1, int point2)
	{
		return (point1 + point2) / 2;
	}
	public static double Average(double number1, double number2, double number3)
	{
		double sum = number1 + number2 + number3;

		return sum / 3;
	}
	public static void PrintName(String name)
	{
		System.out.println("My name is "+ name);
		
	}
}
