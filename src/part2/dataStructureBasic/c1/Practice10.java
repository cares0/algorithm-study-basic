package part2.dataStructureBasic.c1;

import java.util.Scanner;

public class Practice10 {

	// Q6. 배열의 앞 쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하시오.
	static int cardConv(int x, int r, char[] d) {
		int digit = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digit++] = dchar.charAt(x % r);
			x /= r;
			
		} while(x != 0);
		
		for(int i=0;i<digit/2;i++) {
			char t = d[i];
			d[i] = d[digit-i-1];
			d[digit-i-1] = t;
		}
		
		return digit;
	}
	
	// Q7. 기수 변환 과정을 대화식으로 구성하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; // 변환하려는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; //다시 한 번 할 것인지
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 원하는 기수로 변환합니다.");
		
		do {
			do {
				System.out.print("변환하려는 음이 아닌 정수 : ");
				no = sc.nextInt();
			} while(no < 0);
			
			do {
				System.out.print("몇 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			} while(cd < 2 && cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는");
			for(int i=0;i<dno;i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다");
			
			System.out.print("한번 더 하시겠습니까? (1.예 / 2.아니오) : ");
			retry = sc.nextInt();
					
		} while(retry == 1);
		

	}

}
