package com.kozdemir.calculator;

import java.util.Scanner;

public class Test {
public static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
//		
//		CalculatorT1 calculator1 = new CalculatorT1(2, "Cal T1");
//		calculator1.addFunction(new SinFunction());
//		calculator1.addFunction(new CosFunction());
		
//		calculator1.listMathFunction();
		
//		System.out.println();
//		
		CalculatorT1 calculator2 = new CalculatorT1(4, "Cal Fklax");
		calculator2.addFunction(new SinFunction());
		calculator2.addFunction(new CosFunction());
		calculator2.addFunction(new LogFunction());
////	calculator2.addFunction(new FactorialFunction());
		calculator2.addFunction(new SquaredFunction());
//	
//	calculator2.listMathFunction();
		
		startCalculator(calculator2);
		
	}

	private static void startCalculator(Calculator calculator) {
		calculator.listMathFunction();
				
		System.out.print("Please enter the name of the function:");
		String functionName = in.next(); 
		if(functionName.equalsIgnoreCase("end"))
			System.exit(0);
		System.out.print("Please enter the argument of the function:");
		double functionArg = in.nextDouble(); 
		double result = calculator.doCalculation(functionName, functionArg);
		
		System.out.println(functionName + " of " + functionArg + " is " + result + "\n");
		
		startCalculator(calculator);
	}
}
