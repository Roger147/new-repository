package com.revature;

public class Main {

	public static void main(String[] args) {
		STEM nerd = new STEM("bob", 2);
		STEM nerd2 = new Engineer("roy", 3);
		STEM nerd3 = new Scientist("Ashley", 4);
		STEM nerd4 = new Mathematician("sarah", 4);
		System.out.println(nerd.universityYear());
		System.out.println(nerd.doesMath());
		System.out.println(nerd2.universityYear());
		System.out.println(nerd2.doesMath());
		System.out.println(nerd3.universityYear());
		System.out.println(nerd3.doesMath());
		System.out.println(nerd4.universityYear());
		System.out.println(nerd4.doesMath());
		
		nerd.setYear(6);
		nerd2.setYear(4);
		nerd3.setName("Ashley Bates");
		System.out.println(nerd2.universityYear());

	}
	
}
