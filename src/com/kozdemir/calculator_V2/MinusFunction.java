package com.kozdemir.calculator_V2;

public class MinusFunction extends AbstractDoubleArgMathFunction {

	public MinusFunction() {
		super("minus");
	}

	@Override
	public double calculate(double arg1, double arg2) {
		return arg1 - arg2;
	}

}
