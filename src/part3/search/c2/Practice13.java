package part3.search.c2;

import java.util.Scanner;

public class Practice13 {

	// Q2. 선형검색 과정을 상세하게 출력하는 프로그램을 작성하시오
	static int seqSearchSen(int[] a, int n, int key) {
		a[n] = key;
		
		System.out.printf("   |");
		for(int i=0;i<a.length-1;i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+---------------------------");
		
		for(int i=0;i<a.length;i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 3) + 2), "");
			System.out.printf("%3d|", i);
			for(int j=0;j<a.length-1;j++) {
				System.out.printf("%3d", a[j]);
			}
			System.out.println();
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
