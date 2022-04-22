package part5.recursive.c1;

public class Practice23 {

	// Q1. 재귀 메서드 호출을 사용하지 않고 factorial을 구하는 메서드를 작성하시오
	static int factorial(int n) {	
		int result = 1;
		
		for(int i=2; i<=n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	// Q2. 재귀 메서드 호출을 사용하지 않고 최대공약수를 구하시오
	static int gcd(int a, int b) {
		int temp;
		while(b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
		System.out.println(gcd(12016, 3052));
	}
}
