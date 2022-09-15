package com.kozdemir.calculator;

public class SinFunction extends AbstractMathFunction {

	
	public SinFunction() {
		//name = "sin";
		super("sin");
	}

	
	@Override
	public double calculate(double arg) {
		return Math.sin(arg);
	}
	
	
	
}
