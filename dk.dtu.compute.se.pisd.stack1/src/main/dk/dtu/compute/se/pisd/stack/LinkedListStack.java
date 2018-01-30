package dk.dtu.compute.se.pisd.stack;

/**
 * A template for implementing a {@see dk.dtu.compute.se.pisd.stack.Stack}
 * as a (singly) linked list. This is supposed to be implemented by
 * the students as the task of assignment 1 of the course. 
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class LinkedListStack implements Stack {
	StackElement stackElement;
	int size = 0;
	
	@Override
	public void clear() {
		size = 0;
		stackElement = null;
	}

	
	@Override
	public Integer pop() {
		/* 
		 * If stackElement is not empty, the top element of the stack is 
		 * returned. The new top element becomes the next element in 
		 * line, and the size of the stack decreases.
		 * If stackElement is empty, null is returned.
		 */
		if(stackElement != null) {
			int result = stackElement.value;
			stackElement = stackElement.next;
			size--;
			return result;
		}
		return null;
	}

	@Override
	public Integer top() {
		/*
		 * If stackElement is not empty, the top element of the stack is 
		 * returned. 
		 * If stackElement is empty, null is returned.
		 */
		if(stackElement != null) {
			int result = stackElement.value;
			return result;
		}
		return null;
	}

	@Override
	public void push(Integer value) {
		/*
		 * A new object of StackElement is created. The new top element 
		 * becomes the pushed value, and the former top value becomes the
		 * next element in line. The size of the stack increases.
		 */
		StackElement se = new StackElement();
		se.value = value;
		se.next = stackElement;
		stackElement = se;
		size++;
	}

	@Override
	public int size() {
		return size;
	}
	
	
	private class StackElement {
		int value;
		StackElement next;
	}
}

