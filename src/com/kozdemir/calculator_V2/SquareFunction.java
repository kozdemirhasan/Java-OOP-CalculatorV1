package com.kozdemir.calculator_V2;

public class SquareFunction extends AbstractSingleArgMathFunction {

	public SquareFunction() {
		super("square");
	}
	@Override
	public double calculate(double arg) {		
		return Math.sqrt(arg);
	}

	
}
