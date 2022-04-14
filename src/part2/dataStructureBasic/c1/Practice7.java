package part2.dataStructureBasic.c1;

import java.util.Random;
import java.util.Scanner;

public class Practice7 {
// Q1. 키와 사람의 수를 난수로 받아서 최댓값을 구하는 프로그램을 작성하시오.
	
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int count = rand.nextInt(1, 10);
		
		int[] height = new int[count]; 
		
		for(int i=0;i<height.length;i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println(height[i]);
		}
		
		System.out.println(count + "명 중에서 제일 큰 키 값은 " + maxOf(height) + "입니다.");

	}

}
