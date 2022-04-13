package part1.algorithmBasic.c2;

public class Practice6 {

	// Q15-1. 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하시오
	static void triangleLB(int n) { 
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	// Q15-2. 왼쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleLU(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
	
	// Q15-3. 오른족 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}		
	}
	
	// Q15-4. 오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.printf(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}		
	}
	
	// Q16. n단의 피라미드를 출력하는 메서드를 작성하시오
	static void spira(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// Q17. n단의 숫자 피라미드를 출력하는 메서드를 작성하시오
	static void npira(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		triangleLB(5);
		System.out.println();
		triangleLU(5);
		System.out.println();
		triangleRU(5);
		System.out.println();
		triangleRB(5);
		System.out.println();
		spira(5);
		System.out.println();
		npira(5);
	}
}
