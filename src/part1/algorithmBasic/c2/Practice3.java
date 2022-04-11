package part1.algorithmBasic.c2;

import java.util.Scanner;

public class Practice3 {

	// Q7. n의 수에 따라 1부터 n까지의 합을 구하는 메서드를 작성하시오
	static int sum(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		return sum;
	}
	
	// Q8. 1부터 n까지의 합은 (1 + n) * (n / 2) 으로 구할 수 있다. 이 방식으로 구현하는 메서드를 작성하시오.
	static double gauss(int n) {
		return (1 + n) * (n / 2.0);
	}
	
	// Q9. 정수 a, b가 주어지면, 두 수를 포함하여 그 사이의 모든 정수의 합을 구하는 메서드를 작성하시오.
	// (단, a와 b의 대소관계에 상관없도록 작성할 것)
	static double atob(int a, int b) {
		return (a + b) * ((Math.abs(a - b) + 1) / 2.0);
	}
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println("i = " + i + " -> " + sum(i));
		}
		
		for(int i=1;i<=10;i++) {
			System.out.println("gauss i = " + i + " -> " + gauss(i));
		}
		
		System.out.println(atob(3, 5));
		System.out.println(atob(6, 4));
	}

}
