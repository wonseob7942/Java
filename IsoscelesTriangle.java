package triangle;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("원하시는 이등변 삼각형의 길이를 입력해주세요 : ");
				
		int stars = scanner.nextInt();
				
		for (int i=1; i< stars+1; i++) {
			for(int j=1; j<=stars-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<2*i; k++) {
				System.out.print("*");
			}
				System.out.println();
		}
	}

}

		