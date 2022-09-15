package com.kozdemir.calculator;

public class CosFunction extends AbstractMathFunction {

	public CosFunction() {
		super("cos");
	}

	@Override
	public double calculate(double arg) {
		return Math.cos(arg);
	}

}
