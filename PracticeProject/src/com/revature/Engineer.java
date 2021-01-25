package com.revature;

public class Engineer extends STEM {
	public Engineer(String name, int Year) {
		super(name, Year);
		
	}

	@Override
	protected String doesMath() {
		return name + " is an engineer. An engineer uses math to create.";
	}
	
}
