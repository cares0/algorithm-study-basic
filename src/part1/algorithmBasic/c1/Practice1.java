package part1.algorithmBasic.c1;

import java.util.Scanner;

public class Practice1 {

	// Q1. 네 값의 최댓값을 구하는 max4 메서드를 작성하세요
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}

		return max;
	}
	
	// Q2. 세 값의 최댓값을 구하는 min3 메서드를 작성하세요
	static int min3(int a, int b, int c) {
		int min = a;		

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}

		return min;
	}
	
	// Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		if (d < min) {
			min = d;
		}

		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
	
		while(check) {
			System.out.println("1. max4\n2. min3\n3. min4\n4. exit");
			int select = sc.nextInt();
			
			switch (select) {
			case 1: 
				System.out.println("첫 번째 숫자 입력");
				int a = sc.nextInt();
				System.out.println("두 번째 숫자 입력");
				int b = sc.nextInt();
				System.out.println("세 번째 숫자 입력");
				int c = sc.nextInt();
				System.out.println("네 번째 숫자 입력");
				int d = sc.nextInt();
				
				System.out.println(max4(a, b, c, d));
			break;
			case 2:
				System.out.println("첫 번째 숫자 입력");
				a = sc.nextInt();
				System.out.println("두 번째 숫자 입력");
				b = sc.nextInt();
				System.out.println("세 번째 숫자 입력");
				c = sc.nextInt();
				
				System.out.println(min3(a, b, c));
			break;
			case 3:
				System.out.println("첫 번째 숫자 입력");
				a = sc.nextInt();
				System.out.println("두 번째 숫자 입력");
				b = sc.nextInt();
				System.out.println("세 번째 숫자 입력");
				c = sc.nextInt();
				System.out.println("네 번째 숫자 입력");
				d = sc.nextInt();
				
				System.out.println(min4(a, b, c, d));
			break;
			default:
				check = false;
			}	
		}
	}
}
