package part2.dataStructureBasic.c1;

import java.util.Scanner;

public class Practice9 {

	// Q4. 배열 b의 요소를 배열 a에 복사하는 메서드를 작성하시오
	static int[] copy(int[] a, int[] b) {
		b = a.clone();
		return b;
	}
	
	// Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy를 작성하시오.
	static int[] rcopy(int[] a, int[] b) {
		
		a = b.clone();
		
		for(int i=0;i<a.length/2;i++) {
			int t = a[a.length - i - 1];
			a[a.length - i - 1] = a[i];
			a[i] = t;
		}
		
		return a;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 입력 : ");
		int[] a = new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.print(i + "번째 인덱스 값 입력 : ");
			a[i] = sc.nextInt();
		}
		
		
		int[] b = new int[a.length];
		b = copy(a, b);
		
		System.out.println("배열을 복제합니다");
		for(int i=0;i<b.length;i++) {
			System.out.println(i+"번째 인덱스" + b[i]);
		}
		
		System.out.println("배열을 역순으로 복제합니다");
		a = rcopy(a, b);
		for(int i=0;i<a.length;i++) {
			System.out.println(i+"번째 인덱스" + a[i]);
		}

	}

}
