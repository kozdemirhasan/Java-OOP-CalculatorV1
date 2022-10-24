package com.kozdemir.calculator_V2;

public abstract class AbstractDoubleArgMathFunction implements IDoubleArgMathFunction {

	protected String name;

	public AbstractDoubleArgMathFunction(String name) {
		this.name = name;
	}

	@Override
	public final String getName() {
		return name;
	}

	

}
