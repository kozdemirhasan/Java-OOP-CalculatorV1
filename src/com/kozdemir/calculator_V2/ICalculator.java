package com.kozdemir.calculator_V2;

public interface ICalculator {
		
	public void addFunction(IMathFunction function);
	
	public void listMathFunction();	

	public double doCalculation(String functionName, double arg);
	
	public double doCalculation(String functionName, double arg1, double arg2);
	
	
}
