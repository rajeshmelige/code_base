package data_structures;

public class MyQueue {
	
	int index;
	Object elements[];
	static final int MAX = 1000;
	
	public MyQueue() {
		index = -1;
		elements = new Object[MAX];
	}
	public void enqueue(Object o) {
		if(index<MAX) {
			elements[++index] = o;
		} else {
			System.out.println("Max limit of Queue reached");
		}
	}
	public Object dequeue() throws Exception {
		Object o;
		if(index<0) {
			throw new Exception("Queue is empty");
		} else {
			o = elements[0];
			for(int i=0;i<index-1;i++) {
				elements[i]=elements[i+1];
			}
			index--;
			return o;
		}
	}
}
