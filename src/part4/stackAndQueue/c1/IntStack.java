package part4.stackAndQueue.c1;

public class IntStack {

	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk;  //스택 본체
	
	// 스택이 비어있을 경우 예외
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {};
	}
	
	// 스택이 가득 찼을 때 예외
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}

	// 생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 데이터 삽입
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	// 데이터 꺼내기
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}

	// 스택의 맨 윗 데이터 검출
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) { // 스택이 비어있는 경우
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	// 스택의 데이터 검색
	public int indexOf(int x) {
		for(int i=ptr - 1; i>=0; i--) {
			if(stk[i] == x) {
				return i; // 검색 성공
			}
		}
		return -1; // 검색 실패
	}
	
	// 스택의 데이터 모두 삭제
	public void clear() {
		ptr = 0; // 모든 요소의 추가/삭제 등등은 모두 스택 포인터를 가지고 하기에 ptr을 0으로 수정하면 모두 삭제하는 것과 다름 없음
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
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		} else {
			for (int i=0; i<ptr; i++) {
				System.out.printf(stk[i] + " ");
			}
			System.out.println();
		}
	}
	
}
