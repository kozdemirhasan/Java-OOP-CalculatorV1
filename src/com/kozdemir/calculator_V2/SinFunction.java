package com.kozdemir.calculator_V2;

public class SinFunction extends AbstractSingleArgMathFunction {

	public SinFunction() {
		super("sin");		
	}

	@Override
	public double calculate(double arg) {		
		return Math.sin(arg);
	}

}
