package Implement;

//for�?
/*
- 별찍�?2 2439
첫째 줄에?�� �? 1�?, ?���? 줄에?�� �? 2�?, N번째 줄에?�� �? N개�?? 찍는 문제
?��른쪽?��?��
*/

import java.util.Scanner;

public class for_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i=0; i<a; i++) {
			for (int j=a; j>i+1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i+1; j++) {
				System.out.printf("%s","*");
			}
			System.out.print("\n");
		}
	    sc.close();
	}

}
