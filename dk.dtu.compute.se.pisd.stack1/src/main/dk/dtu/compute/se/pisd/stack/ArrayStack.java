package dk.dtu.compute.se.pisd.stack;

/**
 * A template for implementing a {@see dk.dtu.compute.se.pisd.stack.Stack}
 * by using arrays. This is supposed to be implemented by
 * the students as a task of assignment 1 of the course. Note that
 * since Java arrays cannot be extended dynamically, the array must
 * be replaced at some points by a larger array.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class ArrayStack implements Stack {
	int[] array = new int[10];
	int top=-1;
	
	@Override
	public void clear() {
		for(int i=0; i<array.length;i++) {
			array[i]=0;
			top=-1;
		}

	}

	@Override
	public Integer pop() {
		/* 
		 * If the stack is not empty(top is not equal to -1), the top element 
		 * of the stack is returned, and the size of the stack index decreases.
		 * If the stack is empty, null is returned.
		 */
		if(top!=-1) {
			int result = array[top];
			top--;
			return result;
		}
		return null;
	}

	@Override
	public Integer top() {
		/* 
		 * If the stack is not empty(top is not equal to -1), the top element 
		 * of the stack is returned.
		 * If the stack is empty, null is returned.
		 */
		if(top!=-1) {
			return array[top];
		}
		return null;
	}

	@Override
	public void push(Integer value) {
		top++;
		if(array.length<=top) {	
			asserSize(array.length);
		}
		array[top] = value;
		
	}
	
	void asserSize(int size) {
		int[] na = new int[size*2];
		
		for(int i=0; i<array.length;i++) {
			na[i] = array[i];
		}
		array = na;
	}

	@Override
	public int size() {
		return top+1;
	}
	
	

}
