package Implement;


//?���?
/*
- ?��?��리얼 10872
0보다 ?��거나 같�? ?��?�� N?�� 주어진다. ?��?��, N!?�� 출력?��?�� ?��로그?��?�� ?��?��?��?��?��.
*/

import java.util.Scanner;

public class math_10872 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(fac(a));
		
		sc.close();
	}

	private static int fac(int a) {
		
		if(a<=1) {
			return 1;
		}
		else {
			return a*fac(a-1);

		}
	}
	
}