package part4.stackAndQueue.c1;

import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.println("1. push | 2.pop | 3.peek | 4.dump | 5.searchIndex | 6.clear | 0.exit");
			int select = sc.nextInt();
			if (select == 0) {
				break;
			}
			
			int x;
			
			switch(select) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("출력한 데이터는 " + x + "입니다.");	
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			
			case 3:
				try {
					x = s.peek();
					System.out.println("맨 윗지점은 " + x + "이(가) 들어가 있습니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 4:
				s.dump();
				break;
			case 5:
				if(s.isEmpty()) {
					System.out.println("스택이 비어있습니다.");
				} else {
					System.out.print("검색할 데이터 : ");
					x = sc.nextInt();
					
					System.out.println((s.indexOf(x) == -1) ? "찾는 데이터가 없습니다." : x + "는" + s.indexOf(x) + "번째 인덱스에 있습니다.");
				}
				break;
			case 6:
				if(s.isEmpty()) {
					System.out.println("이미 스택이 비어있습니다.");
				} else {
					s.clear();
					System.out.println("비우기 완료");
				}
				break;
				
			default:
				System.out.println("잘못 눌렀습니다.");
			}
			
		}
		

	}

}
