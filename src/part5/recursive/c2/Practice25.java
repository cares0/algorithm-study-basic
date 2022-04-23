package part5.recursive.c2;

import java.util.Scanner;

import part4.stackAndQueue.c1.IntStack;

public class Practice25 {

	
	static void recur(int n) {
		if(n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	static void recur2(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	
	
	static void recur3(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			if(!s.isEmpty()) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		
		recur2(x);
	}
}
