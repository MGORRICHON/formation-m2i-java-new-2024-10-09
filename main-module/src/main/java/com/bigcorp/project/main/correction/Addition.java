package com.bigcorp.project.main.correction;

public class Addition implements Operation {

	@Override
	public double apply(double d1, double d2) {
		return d1 + d2;
	}

}
