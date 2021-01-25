package com.revature;

public class STEM {
	protected int Year;
	protected String name;
	public STEM(String name, int x) {
		this.setName(name);
		this.setYear(x);
	}
	
	public void setName(String name) {
		String firstLetter = name.substring(0, 1).toUpperCase();
		String restOfName = name.substring(1);
		this.name = firstLetter + restOfName;
		// taken from example during lecture ! 
		if( name.contains(" "))
			System.out.println("No spaces allowed!");
	}

	public void setYear(int i) {
		if (i <= 0 || i > 4)
			System.out.println("Invalid year");
		else
			this.Year= i;
	}
		
	public String universityYear() {
		return name + " is a year "+ Year + " student";
	}
	
	protected String doesMath() {
		return name + " is a STEM Major. STEM majors use math.";		
	}
}
