package part1.algorithmBasic.c2;

import java.util.Scanner;

public class Practice5 {
	
	// Q12. 곱셈표를 출력하는 메서드를 작성하시오.
	static void multiplyTable() {
		System.out.print("   |");
		for(int i=1;i<=9;i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+---------------------------");
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%2d |", i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
	
	// Q13. 덧셈표를 출력하는 메서드를 작성하시오
	static void addTable() {
		System.out.print("   |");
		for(int i=1;i<=9;i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+---------------------------");
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%2d |", i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}		
	}
	
	// Q14. 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 메서드를 작성하시오
	static void square() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		multiplyTable();
		addTable();
		square();
	}

}
