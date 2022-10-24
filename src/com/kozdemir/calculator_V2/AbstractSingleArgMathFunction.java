package com.kozdemir.calculator_V2;

public abstract class AbstractSingleArgMathFunction implements ISingleArgMathFunction {

	protected String name;

	public AbstractSingleArgMathFunction(String name) {
		this.name = name;
	}

	@Override
	public final String getName() {
		return name;
	}

}
