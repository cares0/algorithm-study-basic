package part1.algorithmBasic.c2;

import java.util.Scanner;

public class Practice4 {

	public static Scanner sc = new Scanner(System.in);
	
	// Q10. 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하시오.
	static int minus() {
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		
		int b;
		
		do {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			if(a > b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while(a > b);
		
		return b - a;
	}
	
	// Q11. 양의 정수를 입력하고 자릿수를 축력하는 프로그램을 작성하세요.
	static int degits() {
		int num;
		
		do {	
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
		} while(num <= 0);
		
		int count = 0;
		while(num > 0) {
			num /= 10;
			count++;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {

		System.out.println("b - a는 " + minus() + "입니다.");
		System.out.println("자릿수는 " + degits() + "자리 입니다.");

	}

}
