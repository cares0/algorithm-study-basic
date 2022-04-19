package part4.stackAndQueue.c1;

public class GStack<E> {

	private int max;
	private int pointer;
	private E[] stack;
	
	public static class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
			super("더 이상 스택의 공간이 없습니다");
		}
	}
	
	public static class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
			super("스택이 비어있습니다.");
		}
	}
	
	// 생성자
	public GStack(int capacity) {
		max = capacity;
		pointer = 0;
		try {
			stack = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public boolean isEmpty() {
		return pointer <= 0;
	}
	
	public boolean isFull() {
		return pointer >= max;
	}
	
	// push
	public E push(E data) throws OverflowStackException {
		if(isFull()) {
			throw new OverflowStackException();
		}
		return stack[pointer++] = data;
	}
	
	// pop
	public E pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[--pointer];
	}

	// peek
	public E peek() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[pointer - 1];
	}
	
	// indexOf
	public int indexOf(E data) throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		for(int i=0; i<pointer; i++) {
			if(stack[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	
	// clear
	public void clear() {
		pointer = 0;
	}
	
	// capacity
	public int capacity() {
		return max;
	}
	
	// size
	public int size() {
		return pointer;
	}
	
	// dump
	public void dump() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		for(int i=0; i<pointer; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}
