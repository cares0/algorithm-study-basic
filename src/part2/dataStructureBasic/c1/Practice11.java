package part2.dataStructureBasic.c1;

public class Practice11 {

	public static void main(String[] args) {
		int counter = 0; // 나눗셈의 횟수
		
		for(int n = 2; n<= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i == 0) {
					break; // 더 이상 소수가 아님
				}
			}
			if(n == i) { // 나머지가 0인 경우가 없다는 소리임
				System.out.println(n); // 소수
			}
			
		}
		System.out.println("나눗셈을 수행한 횟수 " + counter);

	}

}
