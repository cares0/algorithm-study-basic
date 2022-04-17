package part2.search.c3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice16 {

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		public String toString() {
			return name + "/" + height + "/" + vision;
		}


		private static class HeightOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				if(o1.height > o2.height) {
					return 1;
				} else if(o1.height < o2.height) {
					return -1;
				} else {
					return 0;
				}
			}

		}

		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PhyscData[] x = {
				new PhyscData("강민하", 162, 0.3),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("황지안", 169, 0.8),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("박준서", 175, 2.0),
		};

		System.out.print("몇 cm를 찾을까요?");

		int height = sc.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0) , PhyscData.HEIGHT_ORDER);
		
		if(idx < 0) {
			System.out.println("찾는 사람이 없습니다.");
		} else {
			System.out.println(idx + "번째에 있습니다.");
			System.out.println(x[idx]);
		}

	}

}
