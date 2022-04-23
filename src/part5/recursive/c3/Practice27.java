package part5.recursive.c3;

public class Practice27 {
	// Q6. 기둥을 숫자로 표시하지 않고 문자로 표시하시오
	static int count = 0;
	
	static void move(int num, String from, String to) {
		System.out.println(num + "을" + from +"기둥에서 " + to + "기둥으로 옮깁니다");
		count ++;
	}
	
	static void hanoi(int n, String from, String by, String to) {
		if(n == 1) {
			move(n, from, to);
		} else {
			hanoi(n - 1, from, to, by);
			move(n, from, to);
			hanoi(n - 1, by, from, to);			
		}
		
	}
	
	public static void main(String[] args) {
		hanoi(3, "A", "B", "C");
		System.out.println(count);
	}
	
}
