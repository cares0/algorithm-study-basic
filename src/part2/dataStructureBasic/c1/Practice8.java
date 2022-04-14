package part2.dataStructureBasic.c1;

import java.util.Arrays;
import java.util.Scanner;

public class Practice8 {
// Q2. 배열 요소를 역순으로 정렬하는 과정을 하나 하나 나타내는 프로그럼을 작성하시오.
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			swap(a, i, a.length-i-1);
		}
		System.out.println("역순으로 정렬합니다");
		System.out.println(Arrays.toString(a));
		
	}
	
	// Q3. 배열의 모든 요소 합을 구하여 반환하는 메서드를 작성하시오.
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 : ");
		int[] a = new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++) {
			System.out.println(i + "번째 값 입력");
			a[i] = sc.nextInt();
		}
		
		reverse(a);
		
		System.out.println(sumOf(a));
	}

}
