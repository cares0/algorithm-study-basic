package part4.stackAndQueue.c2;

public class IntQueue {

	private int max; 
	private int front; // dequeue 되는 지점
	private int rear; // inqueue되는 지점
	private int number; // 큐 안의 데이터의 갯수를 표시
	private int[] queue; // 큐 본체
	
	public IntQueue(int capacity) {
		max = capacity;
		front = rear = number = 0;
		try {
			queue = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			super("큐가 가득 차있습니다.");
		}
	}
	
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			super("큐가 비어있습니다.");
		}
	}
	
	public boolean isEmpty() {
		return number <= 0;
	}
	
	public boolean isFull() {
		return number >= max;
	}
	
	public int enqueue(int data) throws OverflowQueueException {
		if(isFull()) {
			throw new OverflowQueueException();
		}
		queue[rear++] = data; // rear 지점에 데이터 삽입 후 rear값 +1
		number++; // 데이터의 총 갯수 +1
		if(rear >= max) { // 만약 rear지점이 max와 같아진다면 다시 0으로 초기화
			rear = 0;
		}
		return data;
	}
	
	public int dequeue() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		int deletedData = queue[front++]; // front지점의 데이터 삭제처리(실제 삭제되는건 아님)
		number--; // 데이터의 총 갯수 -1
		if(front >= max) { // 만약 front지점이 max와 같아진다면 다시 0으로 초기화
			front = 0;
		}
		return deletedData;
	}
	
	public int peek() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		return queue[front];
	}
	
	public int indexOf(int data) throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		for(int i=front; i<front + number; i++) {
			if(queue[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		front = rear = number = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return number;
	}
	
	public void dump() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		for(int i=front; i<front + number; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
