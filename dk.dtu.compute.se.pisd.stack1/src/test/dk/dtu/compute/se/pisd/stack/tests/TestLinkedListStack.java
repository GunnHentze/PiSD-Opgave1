package dk.dtu.compute.se.pisd.stack.tests;

import dk.dtu.compute.se.pisd.stack.LinkedListStack;

public class TestLinkedListStack extends TestStack {

	@Override
	public void setUp() throws Exception {
		stack = new LinkedListStack();
	}

}
