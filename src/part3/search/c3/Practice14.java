package part3.search.c3;

import java.util.Scanner;

public class Practice14 {

	// Q3. 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 
	// 배열 idx에 순서대로 저장하고 일치한 요솟수를 반환하는 메서드를 작성하시오
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count = 0;
		
		for(int i=0;i<n;i++) {
			if(key == a[i]) {
				idx[count] = i;
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = sc.nextInt();
		
		int[] idx = new int[num];
		int count = searchIdx(x, num, ky, idx);
		
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			System.out.println(idx[i]);
		}

	}

}
