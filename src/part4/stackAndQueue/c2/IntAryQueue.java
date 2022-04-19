package part4.stackAndQueue.c2;

public class IntAryQueue {
	
	private int max; // 큐 용량
	private int number; // 현재 데이터 수
	private int[] queue; // 큐 본체
	
	public IntAryQueue(int capacity) {
		max = capacity;
		number = 0;
		try {
			queue = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			super("큐가 비어있습니다.");
		}
	}
	
	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			super("큐가 가득 찼습니다.");
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
		return queue[number++] = data;
	}
	
	public int dequeue() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		int dequeueData = queue[0];
		for(int i=0; i<number; i++) {
			queue[i] = queue[i+1];
		}
		number --;
		return dequeueData;
	}
	
	public int peek() throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		return queue[number- 1];
	}
	
	public int indexOf(int data) throws EmptyQueueException {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		for(int i=0; i<number; i++) {
			if(queue[i] == data) {
				return i;				
			}
		}
		return -1;
	}
	
	public void clear() {
		number = 0;
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
		
		for(int i=0; i<number; i++) {
			System.out.println(queue[i] + " ");
		}
		System.out.println();
	}
	
	

}
