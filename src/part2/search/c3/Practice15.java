package part2.search.c3;

import java.util.Scanner;

public class Practice15 {
	
	// Q5. 중복된 값일 경우 제일 앞쪽의 인덱스를 찾도록 수정하시오
	static int binSearch(int[] a, int n, int key) {
		int start = 0;
		int end = n - 1;
		
		do {
			int center = (start + end) / 2;
			if(a[center] == key) {
				do {
					center--;
				} while(a[center] == key);
				return center + 1;
			} else if(a[center] < key) {
				start = center + 1;
			} else {
				end = center - 1;
			}
		} while(start <= end);
		return - 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1;i<num;i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while(x[i-1] > x[i]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("찾는 값이 없습니다.");
		} else {
			System.out.println(idx + "번째 인덱스에 있습니다.");
		}
		

	}

}
