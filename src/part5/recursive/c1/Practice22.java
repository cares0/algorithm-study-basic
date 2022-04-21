package part5.recursive.c1;

public class Practice22 {

	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
