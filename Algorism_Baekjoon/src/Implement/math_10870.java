package Implement;


//?���?
/*
- ?��보나치수?�� 10870
?��보나�? ?��?�� 0�? 1�? ?��?��?��?��. 0번째 ?��보나�? ?��?�� 0?���?, 1번째 ?��보나�? ?��?�� 1?��?��. 
�? ?��?�� 2번째 �??��?�� 바로 ?�� ?�� ?��보나�? ?��?�� ?��?�� ?��?��.
?���? ?��?���? ?��보면 Fn = Fn-1 + Fn-2 (n ?�� 2)�? ?��?��.
n=17?��?�� 까�? ?��보나�? ?���? ?��보면 ?��?���? 같다.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
n?�� 주어졌을 ?��, n번째 ?��보나�? ?���? 구하?�� ?��로그?��?�� ?��?��?��?��?��.
*/

import java.util.Scanner;

public class math_10870 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.println(Fibonacci(a));
		
		sc.close();
	}

	private static int Fibonacci(int a) {
		if(a==0) {
			return 0;
		} else if(a==1) {
			return 1;
		} else {
			return Fibonacci(a-1)+Fibonacci(a-2);

		}
	}
	
}