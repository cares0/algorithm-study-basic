package part5.recursive.c2;

import java.util.Scanner;

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
			int temp = n;
			n = n - 1;
			System.out.println(temp);
			n = temp - 2;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		
		recur2(x);
	}
}
