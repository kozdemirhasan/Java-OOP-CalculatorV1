package com.kozdemir.calculator_V2;

public class AddFunction extends AbstractDoubleArgMathFunction {

	public AddFunction() {
		super("add");
	}

	@Override
	public double calculate(double arg1, double arg2) {
		return arg1 + arg2;
	}

}
