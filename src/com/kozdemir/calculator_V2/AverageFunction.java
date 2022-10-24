package com.kozdemir.calculator_V2;

public class AverageFunction extends AbstractDoubleArgMathFunction {

	public AverageFunction() {
		super("average");
	}

	@Override
	public double calculate(double arg1, double arg2) {
		return ((arg1 + arg2) / 2);
	}

}
