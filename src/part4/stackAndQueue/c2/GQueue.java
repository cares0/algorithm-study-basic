package part4.stackAndQueue.c2;

public class GQueue<E> {
	
	private int max;
	private int number;
	private int front;
	private int rear;
	private E[] queue;
	
	public GQueue(int capacity) {
		max = capacity;
		number = front = rear = 0;
		try {
			queue = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
		
	}
	
	public static class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
			super("큐가 비어있습니다.");
		}
	}
	
	public static class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
			super("큐가 가득찼습니다.");
		}
	}
	
	public boolean isEmpty() {
		return number <= 0;
	}
	
	public boolean isFull() {
		return number >= max;
	}
	
	public E enqueue(E data) throws Exception {
		if(isFull()) {
			throw new OverflowQueueException();
		}
		queue[rear++] = data;
		number++;
		if(rear >= max) {
			rear = 0;
		}
		return data;
	}
	
	public E dequeue() throws Exception {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		E delete = queue[front++];
		number--;
		if(front >= max) {
			front = 0;
		}
		return delete;
	}
	
	public E peek() throws Exception {
		if(isEmpty()) {
			throw new EmptyQueueException();
		}
		return queue[front];
	}
	
	public int indexOf(E data) {
		for(int i=0; i<max; i++) {
			int idx = (i + front) % max;
			if(queue[idx].equals(data)) {
				return idx;				
			}
			
		}
		return -1;
	}
	
	public void clear() {
		number = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return number;
	}
	
	public void dump() {
		for(int i=0; i<number; i++) {
			System.out.println(queue[(front + i) % max] + " ");			
		}
		System.out.println();
	}
	
	public int search(E data) {
		for(int i=0; i<max; i++) {
			if(queue[(front + i) % max].equals(data)) {
				return i;
			}
		}
		return -1;
	}

}
