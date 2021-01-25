package com.revature;

public class Scientist extends STEM {
	public Scientist(String name, int Year) {
		super(name, Year);
	}

	@Override
	protected String doesMath() {
		return name + " is a scientist. A scientist uses math to find truth.";
	}	

}
