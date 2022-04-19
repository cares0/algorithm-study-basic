package part4.stackAndQueue.c1;

public class Gstack<E> {

	private int max;
	private int ptr;
	private E[] stack;
	
	// 스택이 비어있을 경우 예외
	public static class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
		}
	}
	
	// 스택이 가득 찼을 때 예외
	public static class FullStackException extends RuntimeException {
		public FullStackException() {
		}
	}

	// 생성자
	public Gstack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stack = (E[]) new Object[capacity];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 데이터 삽입
	public E push(E data) {
		if(ptr >= max) {
			throw new FullStackException();
		}
		return stack[ptr++] = data;
	}
	
	// 데이터 꺼내기
	public E pop() {
		if(ptr <= 0) {
			throw new EmptyStackException();
		}
		return stack[--ptr];
	}

	// 스택의 맨 윗 데이터 검출
	public E peek() {
		if(ptr <= 0) {
			throw new EmptyStackException();
		}
		return stack[ptr - 1];
	}
	
	// 스택의 데이터 검색
	public int indexOf(E data) {
		if(ptr <= 0) {
			throw new EmptyStackException();
		}
		for(int i=0; i<ptr; i++) {
			if(stack[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	
	// 스택의 데이터 모두 삭제
	public void clear() {
		ptr = 0;
	}
	
	// 스택의 용량 확인
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓인 데이터 수
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있는지
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	// 스택이 가득 찼는지
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		for(int i=ptr-1; i>=0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
}
