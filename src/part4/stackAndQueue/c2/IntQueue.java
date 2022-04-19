package part4.stackAndQueue.c2;

public class IntQueue {

	private int max; // 큐의 용량
	private int front; // 첫번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수 - 큐가 비어있거나 가득찬 경우를 위해 설정해야함
	// 가득차든 비어있든 front와 near가 동일하기 때문임
	private int[] que; // 큐 본체
	
	// 큐가 비어있을 경우 예외
	public class EmptyIntQueException extends Exception {
		public EmptyIntQueException() {
			
		}
	}
	
	// 큐가 가득 찼을 경우 예외
	public class OverflowIntQueException extends Exception {
		public OverflowIntQueException() {
			
		}
	}
	
	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// 데이터 인큐
	public int enque(int x) throws OverflowIntQueException {
		if(num >= max) {
			throw new OverflowIntQueException();
		}
		que[rear++] = x;
		num++;
		if(rear == max) {
			rear = 0;
		}
		return x;
	}

	// 데이터 디큐
	public int deque() throws EmptyIntQueException {
		if(num <= 0) {
			throw new EmptyIntQueException();
		}
		int x = que[front++];
		num--;
		if(front == max) {
			front = 0;
		}
		return x;
	}
	
	// 큐에서 데이터를 피크(front 데이터를 출력)
	public int peek() throws EmptyIntQueException {
		if(num <= 0) {
			throw new EmptyIntQueException();
		}
		return que[front];
	}
	
	// 데이터 검색
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
		} else {
			for(int i = 0; i < num; i++) {
				System.out.println(que[(i+front) % max] + " ");
			}
			System.out.println();
		}
	}
}
