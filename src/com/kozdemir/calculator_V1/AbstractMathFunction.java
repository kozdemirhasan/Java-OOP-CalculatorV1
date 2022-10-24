package com.kozdemir.calculator_V1;

public abstract class AbstractMathFunction implements MathFunction {

	protected String name;

	public AbstractMathFunction(String name) {
		this.name = name;
	}

	public final String getName() {
		return name;
	}

}
