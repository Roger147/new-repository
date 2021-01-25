package com.revature;

public class Mathematician extends STEM {
	public Mathematician(String name, int Year) {
		super(name, Year);
	}

	@Override
	protected String doesMath() {
		return name +" is a mathematician. A mathematician uses math to abstract.";
	}
		
}
