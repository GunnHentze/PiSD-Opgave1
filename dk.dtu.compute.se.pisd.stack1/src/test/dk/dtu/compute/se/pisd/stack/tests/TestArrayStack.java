package dk.dtu.compute.se.pisd.stack.tests;

import dk.dtu.compute.se.pisd.stack.ArrayStack;

public class TestArrayStack extends TestStack {

	@Override
	public void setUp() throws Exception {
		stack = new ArrayStack();
	}

}
