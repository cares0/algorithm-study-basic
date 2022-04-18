package part3.search.c3;

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
		
		// Q7. 시력에 대한 내림차순 정렬의 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램을 작성하시오.
		private static class VisionOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				if(o1.vision < o2.vision) {
					return 1;
				} else if(o1.vision > o2.vision) {
					return -1;
				} else {
					return 0;					
				}
			}	
		}
		
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PhyscData[] x = {
				new PhyscData("강민하", 162, 1.3),
				new PhyscData("이수연", 168, 1.2),
				new PhyscData("황지안", 169, 0.9),
				new PhyscData("유서범", 171, 0.7),
				new PhyscData("김찬우", 173, 0.6),
				new PhyscData("장경오", 174, 0.5),
				new PhyscData("박준서", 175, 0.3),
		};

		System.out.print("시력 입력");

		double vision = sc.nextDouble();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision) , PhyscData.VISION_ORDER);
		
		if(idx < 0) {
			System.out.println("찾는 사람이 없습니다.");
		} else {
			System.out.println(idx + "번째에 있습니다.");
			System.out.println(x[idx]);
		}

	}

}
