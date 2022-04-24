package part6.sorting.c1;

import java.util.Scanner;

public class Practice28 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];;
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void bubbleSort(int[] a, int n) {
		// 배열의 크기 - 1만큼 비교, 맨 마지막 요소는 비교 대상이 없기 때문임
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(a[j] > a[j + 1]) { // 비교
					swap(a, j, j + 1); // 교환
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);
		
		System.out.print("오름차순으로 정렬했습니다.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
				
	}
}
