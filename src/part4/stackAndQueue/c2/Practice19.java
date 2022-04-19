package part4.stackAndQueue.c2;

import java.util.Scanner;

import part4.stackAndQueue.c2.IntAryQueue.EmptyQueueException;
import part4.stackAndQueue.c2.IntAryQueue.OverflowQueueException;

public class Practice19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntAryQueue q = new IntAryQueue(6);
		boolean check = true;
		
		while(check) {
			System.out.println("데이터갯수 : " + q.size() + " / 용량 : " + q.capacity());
			System.out.println("1.inqueue 2.dequeue 3.peek 4.search 5.clear 6.dump 0.exit");
			int select = sc.nextInt();
			
			switch (select) {
			case 1: 
				System.out.print("입력할 데이터 : ");
				try {
					q.enqueue(sc.nextInt());
				} catch(OverflowQueueException e) {
					System.out.println(e.getMessage());
				}
			
				break;
			case 2:
				try {
					System.out.println(q.dequeue());
				} catch (EmptyQueueException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				try {
					System.out.println(q.peek());
				} catch (EmptyQueueException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 4:
				System.out.print("검색할 데이터 입력 : ");
				try {
					int search = sc.nextInt();
					int result = q.indexOf(search);
					System.out.println((result == -1) ? "데이터가 없습니다" : result + "번 인덱스에 있습니다");
				} catch (EmptyQueueException e) {
					System.out.println(e.getMessage());
				}
			
				break;
			case 5:
				q.clear();
				System.out.println("비우기 완료");
				
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
