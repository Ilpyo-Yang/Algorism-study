package Implement;

/*
-- 별찍�? - 3 2440 
첫째 줄에?�� �? N�?, ?���? 줄에?�� �? N-1�?, ..., N번째 줄에?�� �? 1개�?? 찍는 문제
*/

import java.util.*;

public class math_2440 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<input; i++) {	
			for (int j=input-i; j>0; j--) {	
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		sc.close();		
	}
	
}