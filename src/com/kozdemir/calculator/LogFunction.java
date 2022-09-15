package com.kozdemir.calculator;

public class LogFunction extends AbstractMathFunction {

	public LogFunction() {
		super("Log");
	}

	@Override
	public double calculate(double arg) {
		return Math.log(arg);
	}

}
