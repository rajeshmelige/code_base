package data_structures;

import java.util.Arrays;

public class MyArrayList<T> {

	private int size = 0;
	private static final int DEFAULT_SIZE = 10;
	private Object elements[];
	
	public MyArrayList() {
		elements = new Object[DEFAULT_SIZE];
	}
	
	public void add(T t) {
		if(size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = t;
	}

	private void ensureCapacity() {
		int newSize = elements.length*2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	@SuppressWarnings("unchecked")
	public T get(int i) {
		if(i>=size || i<0) {
			throw new IndexOutOfBoundsException("Index = "+i+" Size = "+size);
		}
		return (T) elements[i];
	}
	
}
