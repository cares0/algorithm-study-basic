package part2.dataStructureBasic.c1;

import java.util.Scanner;

public class Practice12 {
	
	// 월별 일수
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 평년
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 윤년
	};
	
	// 평년인지 윤년인지 구분
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// Q8. 메서드 dayOfYear를 변수 i와 days 없이 구현하시오. while문을 사용하시오
	static int dayOfYear(int y, int m, int d) {
		
		while(m > 1) {
			d += mdays[isLeap(y)][--m];
		}
		
		return d;
	}
	
	// Q9. y년 m월 d일의 그 해 남은 일 수를 구하는 메서드를 작성하시오
	static int leftDayOfYear(int y, int m, int d) {
		int isLeap = isLeap(y);
		int days = mdays[isLeap][m-1] - d + 1;
		
		for(int i=0; i<12-m;i++) {
			days += mdays[isLeap][12-i-1];
		}
		
		return days;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다");
		
		do {
			System.out.print("년 : ");
			int year = sc.nextInt();
			System.out.print("월 : ");
			int month = sc.nextInt();
			System.out.print("일 : ");
			int day = sc.nextInt();
			
			System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));
			System.out.printf("남은 기간은 %d일 입니다. \n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1.예 / 0.아니오) : ");
			retry = sc.nextInt();			
		} while(retry == 1);

	}

}
