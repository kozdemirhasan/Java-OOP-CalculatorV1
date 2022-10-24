package com.kozdemir.calculator_V2;

import java.util.Scanner;

public class Test {
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		ICalculator calculatorT1 = new T1Calculator(3); //CalculatorT1 hat 3 Eigenschaft (oder Functionen)
		calculatorT1.addFunction(new SinFunction());
		calculatorT1.addFunction(new CosFunction());
		calculatorT1.addFunction(new AddFunction());
		
//		System.out.println(calculateT1.toString());
		
		ICalculator calculatorFlex = new FlexCalculator(2);	//CalculatorFlex hat 2 Eigenschaft (oder Functionen)
		calculatorFlex.addFunction(new CosFunction());
		calculatorFlex.addFunction(new MinusFunction());
		
//		System.out.println(calculatorFlex.toString());
			
		
		
//		startCalculator(calculatorT1);
		startCalculator(calculatorFlex);
		
	}

	private static void startCalculator(ICalculator calculator) {
		calculator.listMathFunction();
		System.out.println("Please enter the name of the funnction (or \"x\" for exit):");
		String functionName = in.next();
		if(functionName.equalsIgnoreCase("x")) {
			System.out.println("Bye!");
			System.exit(0);
		}
		System.out.println("Number of the arguments:");
		String argumentCount = in.next();
		
		double functionArg1;
		double functionArg2;
		
		if(argumentCount.equals("1")){
			System.out.println("Please enter the argument of the function:");
			functionArg1 = in.nextDouble();
			double result = calculator.doCalculation(functionName, functionArg1);
			System.out.println(functionName + " of " + functionArg1 + " is " + result + "\n");
		}
		else{
			System.out.println("Please enter the first argument of the function:");
			functionArg1 = in.nextDouble();
			System.out.println("Please enter the second argument of the function:");
			functionArg2 = in.nextDouble();
			double result = calculator.doCalculation(functionName, functionArg1, functionArg2);
			System.out.println(functionName + " of " + functionArg1 + " and " + functionArg2 + " is " + result + "\n");
			
		}
		
		startCalculator(calculator);
			
		
	}

}
