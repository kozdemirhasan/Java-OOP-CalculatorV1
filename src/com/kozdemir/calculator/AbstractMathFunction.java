package com.kozdemir.calculator;

public abstract class AbstractMathFunction implements MathFunction {

	protected String name;

	public AbstractMathFunction(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
