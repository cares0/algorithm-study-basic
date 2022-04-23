package part5.recursive.c3;

public class Practice26 {

	static int count = 0;
	
	static void move(int num, int from, int to) {
		System.out.println(num + "을" + from +"번 기둥에서 " + to + "번 기둥으로 옮깁니다");
		count ++;
	}
	
	static void hanoi(int n, int from, int to) {
		if(n == 1) {
			move(n, from, to);
		} else {
			hanoi(n - 1, from, 6 - from - to);
			move(n, from, to);
			hanoi(n - 1, 6 - from - to, to);			
		}
		
	}
	
	public static void main(String[] args) {
		hanoi(3, 1, 3);
		System.out.println(count);
	}
	
}
