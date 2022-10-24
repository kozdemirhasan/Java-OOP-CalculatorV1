package com.kozdemir.calculator_V2;

public class CosFunction extends AbstractSingleArgMathFunction{
	
	public CosFunction() {
		super("cos");		
	}

	@Override
	public double calculate(double arg) {		
		return Math.cos(arg);
	}
}
