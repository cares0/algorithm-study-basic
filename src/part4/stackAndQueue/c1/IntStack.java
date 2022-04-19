package part4.stackAndQueue.c1;

public class IntStack {

	public int max; // 스택에 쌓을 수 있는 데이터의 갯수
	public int pointer; // 스택 포인터
	public int[] stack; // 스택 본체
	
	// 스택이 비어있을 경우 던질 예외
	public class EmptyStackException extends RuntimeException {
		public EmptyStackException() {
			super("스택이 비어있습니다");
		}
	}
	
	// 스택이 가득 차있을 경우 던질 예외
	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
			super("스택이 가득 차있습니다");
		}
	}
	
	// 생성자
	public IntStack(int capacity) {
		pointer = 0;
		max = capacity;
		try {
			stack = new int[max]; // 생성할 당시에 스택의 용량을 지정해서 초기화
		} catch (OutOfMemoryError e) { // 스택을 만들 수 없는 경우
			max = 0; 
		}
	}

	// 스택에 데이터 추가 - push
	public int push(int data) throws OverflowStackException {
		if(pointer >= max) {
			throw new OverflowStackException();
		}
		return stack[pointer++] = data; // data가 리턴 됨
	}
	
	// 스택에 데이터 삭제 - pop
	public int pop() throws EmptyStackException {
		if(pointer <= 0) {
			throw new EmptyStackException();
		}
		return stack[--pointer];
	}
	
	// 스택에서 데이터를 피크(맨 위 데이터를 가져옴)
	public int peek() throws EmptyStackException {
		if(pointer <= 0) {
			throw new EmptyStackException();
		}
		return stack[pointer - 1];
	}
	
	// 데이터의 인덱스를 검색
	public int indexOf(int search) throws EmptyStackException {
		if(pointer <= 0) {
			throw new EmptyStackException();
		}
		for(int i=0; i<pointer; i++) {
			stack[i] = search;
			return i;
		}
		return -1; // 찾는 데이터가 없는 경우
	}
	
	// 스택을 비움
	public void clear() {
		pointer = 0;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return pointer;
	}
	
	// 스택이 비어있는지
	public boolean isEmpty() {
		return pointer <= 0;
	}
	
	// 스택이 가득 찼는지
	public boolean isFull() {
		return pointer >= max;
	}
	
	// 스택 내의 모든 데이터 조회
	public void dump() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		for(int i=0; i<pointer; i++) {
			System.out.print(stack[i] + "");
		}
		System.out.println();
	}
	
}
