package Implement;

// 배열
/*
-- ?��?��?�� 개수 2577
첫째 줄에 A, ?���? 줄에 B, ?���? 줄에 C�? 주어진다. 
A, B, C?�� 모두 100보다 같거?�� ?���?, 1,000보다 ?��?? ?��?��?��?��?��.
첫째 줄에?�� A × B × C?�� 결과?�� 0 ?�� �? �? ?��???���? 출력?��?��. 
마찬�?�?�? ?���? 줄�??�� ?�� 번째 줄까�? A × B × C?�� 결과?�� 1�??�� 9까�??�� ?��?���? 각각 �? �? ?��???���? 차�?�? ?�� 줄에 ?��?��?�� 출력?��?��.
*/
import java.util.*;

public class Array_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();		
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.nextLine();
		
		String result = String.valueOf(a*b*c);
		
		for (int j=0; j<=9; j++) {

			int cnt = 0;
			for (int i=0; i<result.length(); i++) {
				if(j==result.charAt(i)-'0') {
					cnt++;			
				}
			}	
			System.out.println(cnt);
		}
		
		sc.close();
	}

}
