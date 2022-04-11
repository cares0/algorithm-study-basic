package part1.algorithmBasic.c1;

public class Practice2 {

	// Q4. 세 값의 중앙값을 구하는 메서드를 작성하세요
	static void med3Wrong(int a, int b, int c) {
		int med;
		
		if(a > b) {
			if(b > c) {
				med = b;
			} else if(a > c) {
				med = c;
			} else {
				med = a;
			}
		} else if(b < c) {
			med = b;
		} else if(a > c) {
			med = a;
		} else {
			med = c;
		}
	}
	// 값이 같을 경우를 고려하지 않음
	
	static int med3Solve(int a, int b, int c) {
		int med;
		
		if(a >= b) {
			if(a > b) {
				if(b >= c) {
					if(b > c) { // a > b > c
						med = b;
					} else { // a > b = c
						med = b;
					}
				} else { // c > b
					if(a >= c) {
						if(a > c) { // a > c > b
							med = c;
						} else { // a = c > b
							med = c;
						}
					} else { // c > a > b
						med = a;
					}
				}	
			} else { // a = b
				if(b >= c) {
					if(b > c) { // a = b > c
						med = b;
					} else { // a = b = c
						med = b;
					}
				} else { // c > a = b
					med = b;
				}
			}
		} else { // b > a
			if(a >= c) {
				if(a > c) { // b > a > c
					med = a;
				} else { // b > a = c
					med = a;
				}
			} else {
				if(b >= c) {
					if(b > c) { // b > c > a
						med = c;
					} else { // b = c > a
						med = c;
					}
				} else { // c > b > a
					med = b;
				}
			}
		}
		
		return med;
	}
	// 값이 같을 경우를 비교하여 모든 경우를 표현
	
	static int med3CleanUp(int a, int b, int c) {
		int med;
		
		if(a >= b) {
			if(b >= c) {
				med = b;
			} else if(a >= c) {
				med = c;
			} else {
				med = a;
			}
		} else if(a > c) {
			med = a;
		} else if(b >= c) {
			med = c;
		} else {
			med = b;
		}
		
		return med;
	}
	// 필요없는 모든 연산 정리
	
	public static void main(String[] args) {
		System.out.println(med3CleanUp(3, 2, 1));
		System.out.println(med3CleanUp(3, 2, 2));
		System.out.println(med3CleanUp(3, 1, 2));
		System.out.println(med3CleanUp(3, 2, 3));
		System.out.println(med3CleanUp(2, 1, 3));
		System.out.println(med3CleanUp(3, 3, 2));
		System.out.println(med3CleanUp(3, 3, 3));
		System.out.println(med3CleanUp(2, 2, 3));
		System.out.println(med3CleanUp(2, 3, 1));
		System.out.println(med3CleanUp(2, 3, 2));
		System.out.println(med3CleanUp(1, 3, 2));
		System.out.println(med3CleanUp(2, 3, 3));
		System.out.println(med3CleanUp(1, 2, 3));
	}

}
