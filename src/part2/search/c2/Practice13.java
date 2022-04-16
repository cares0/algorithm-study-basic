package part2.search.c2;

import java.util.Scanner;

public class Practice13 {

	// Q1. for문을 이용하여 선형검색을 수행하시오
	static int seqSearchSen(int[] a, int n, int key) {
		a[n] = key;
		
		for(int i=0;i<a.length;i++) {
			if(i != n && a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i=0;i<num;i++) {
			System.out.print("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("찾는 값이 없습니다.");
		} else {
			System.out.println("ky는" + idx + "번 인덱스에 있습니다.");
		}

	}

}
