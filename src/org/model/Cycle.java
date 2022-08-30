package org.model;

import cogn.test.Cars;

public class Cycle {
	private void fitness() {
		System.out.println("Cycling is good for cardio");

	}
public static void main(String[] args) {
	Cycle c=new Cycle();
	c.fitness();
	Cars b=new Cars();
	b.model();
}
}
