package part2.dataStructureBasic.c1;

public class Practice11 {

	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수
		int ptr = 0; // 찾은 소수의 갯수
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int n = 5; n <= 1000; n+= 2) { // 대상은 홀수만(짝수는 모두 2로 나눠지기 때문)
			boolean flag = false;
			for(int i = 1; prime[i] * prime[i] <= n; i++) { 
				// 이미 찾은 소수로만 나누면 됨 ptr(소수 배열의 크기)만 반복
				// 단, 이미 찾은 소수의 제곱보다 n이 작다면 나눠보지 않아도 됨
				counter += 2;
				if(n % prime[i] == 0) { // 나눠진다면 더 이상 진행X
					flag = true; // 이 경우는 소수가 아닌 경우이기에
					break;
				}
			}
			if(!flag) { // 소수인 경우에 저장
				prime[ptr++] = n;
			}
				
		}
		
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("횟수 : " + counter);

	}

}
