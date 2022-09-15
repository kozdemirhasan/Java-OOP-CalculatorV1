package com.kozdemir.calculator;


public class CalculatorT1 implements Calculator {
	private  String calName;
	private int functionCount;
	private int currentCount = 0;

	private MathFunction[] functions;
	private double argument;

	public CalculatorT1(int functionCount, String calName) {
		this.calName=calName;
		this.functionCount = functionCount;
		functions = new MathFunction[functionCount];
	}
	

	@Override
	public void addFunction(MathFunction function) {
		functions[currentCount] = function;
		currentCount++;

	}

	@Override
	public void listMathFunction() {
		System.out.println("Avaible functions of "+ calName +":");
		for (MathFunction function : functions) {
			System.out.print(function.getName()); 
			System.out.print(" ");
		}
		System.out.println();

	}

	@Override
	public double doCalculation(String functionName, double arg) {
		double result = 0.0;
		boolean isFunctionFound = false;
		for (MathFunction function : functions) {
			if (functionName.equalsIgnoreCase(function.getName())) {
				result = function.calculate(arg);
				isFunctionFound = true;
				System.out.println(functionName + " of " + arg + " is " + result + "\n");
			}
		}
		if (!isFunctionFound) {
			
			System.out.println("No such function found!");
			System.out.println();
			System.out.println();
		}

		return result;
	}

}
