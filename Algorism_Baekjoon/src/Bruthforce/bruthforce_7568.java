package Bruthforce;

//브루?��?��?��
/*
-- ?���? 7568
�? 줄에?�� ?���? ?��?��?�� ?�� N?�� 주어진다. 
그리�? ?��?���??�� N개의 줄에?�� �? ?��?��?�� 몸무게�? ?���? ?��???��?�� ?��?�� ?��?�� x?? y�? ?��?��?�� 공백?�� ?���? 각각 ?��???��?��.
?��?��분�? ?��?��?�� ?��?��?�� ?��?��?�� ?���? ?��?���? 구해?�� �? ?��?��??�? �? 줄에 출력?��?�� ?��?��. 
?��, �? ?���? ?��?��?�� 공백문자�? 분리?��?��?�� ?��?��.
*/

import java.util.Scanner;

public class bruthforce_7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] figure = new int[cnt+1][2];
		
		for (int i=0; i<cnt; i++) {
			figure[i][0] = sc.nextInt();
			figure[i][1] = sc.nextInt();	
		}
		
		int rank =0 ;
		
		for (int i=0; i<cnt; i++) {
			rank = 1;
			for (int j=0; j<cnt; j++) {
				if(figure[i][0]<figure[j][0] && figure[i][1]<figure[j][1]) {
					rank++;
				}
			}
			if(i==0) System.out.print(rank);
			else System.out.print(" "+rank);
		}
	}

}
