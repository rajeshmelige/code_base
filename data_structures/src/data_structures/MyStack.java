package data_structures;

public class MyStack {
	int top;
	Object elements[];
	static final int MAX = 1000;
	MyStack() {
		top = -1;
		elements = new Object[MAX];
	}
	public void push(Object o) {
		if(top<MAX) {
			elements[++top] = o;
		} else {
			System.out.println("Stack overflow");
		}
	}
	public Object pop() {
		if(top<0) {
			System.out.println("Stack underflow");
		}
		return elements[top--];
	}
	public Object peek() {
		if(!isEmpty())
			return elements[top];
		return "Stack is empty";
	}
	private boolean isEmpty() {
		if(top<0)
			return true;
		return false;
	}
}
