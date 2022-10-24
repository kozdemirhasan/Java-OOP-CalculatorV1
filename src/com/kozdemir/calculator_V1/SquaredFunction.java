package com.kozdemir.calculator_V1;

public class SquaredFunction extends AbstractMathFunction {

	public SquaredFunction() {
		super("Squared");
	}

	@Override
	public double calculate(double arg) {
		return Math.sqrt(arg);
	}
}
