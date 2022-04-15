package part2.dataStructureBasic.c1;

public class Practice11 {

	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 갯수
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n+= 2) { // 대상은 홀수만(짝수는 모두 2로 나눠지기 때문)
			int i;
			for(i = 1; i < ptr; i++) { // 이미 찾은 소수로만 나누면 됨 ptr(소수 배열의 크기)만 반복
				counter++;
				if(n % prime[i] == 0) { // 나눠진다면 더 이상 진행X
					break;
				}
			}
			if(ptr == i) { // 배열의 마지막인덱스 숫자까지 나눠지지 않았다면 소수임
				prime[ptr++] = n;
			}
			
				
		}
		
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("횟수 : " + counter);

	}

}
