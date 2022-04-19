package part4.stackAndQueue.c2;

import java.util.Scanner;

import part4.stackAndQueue.c2.IntQueue.EmptyQueueException;
import part4.stackAndQueue.c2.IntQueue.OverflowQueueException;

public class Practice20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		IntQueue q = new IntQueue(6);
		
		while(check) {
			System.out.println("데이터갯수 : " + q.size() + " / 용량 : " + q.capacity());
			System.out.println("1.enqueue 2.dequeue 3.peek 4.search 5.clear 6.dump 0.exit");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				try {
					System.out.print("입력할 데이터 : ");
					q.enqueue(sc.nextInt());
				} catch (OverflowQueueException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 2:
				try {
					System.out.println(q.dequeue() + "가 삭제되었습니다.");
				} catch (EmptyQueueException e) {
					System.out.println(e.getMessage());
				}
				
				break;	
			case 3:
				try {
					System.out.println("결과 : " + q.peek());
				} catch (EmptyQueueException e) {
					System.out.println(e.getMessage());	
				}
			
				break;
			case 4:
				if(q.isEmpty()) {
					System.out.println("큐에 데이터가 없습니다.");
				} else {
					System.out.print("검색할 데이터 : ");
					int result = q.indexOf(sc.nextInt());
					System.out.println((result == -1) ? "찾는 데이터가 없습니다." : result + "번째 인덱스에 있습니다.");
				}
				
				break;
			case 5:
				q.clear();
				
				break;
			case 6:
				try {
					q.dump();
				} catch (EmptyQueueException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			default:
				check = false;
			}
		
		}
		
	}

}
