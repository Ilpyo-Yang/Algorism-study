package Implement;

// 배열
/*
-- 최소, 최�? 10818
첫째 줄에 ?��?��?�� 개수 N (1 ?�� N ?�� 1,000,000)?�� 주어진다. ?���? 줄에?�� N개의 ?��?���? 공백?���? 구분?��?�� 주어진다. 
모든 ?��?��?�� -1,000,000보다 ?��거나 같고, 1,000,000보다 ?��거나 같�? ?��?��?��?��.
첫째 줄에 주어�? ?��?�� N개의 최솟값과 최댓값을 공백?���? 구분?�� 출력?��?��.
*/
import java.util.*;

public class Array_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		List<Integer> listArr = new ArrayList<>();
		
		for (int i=0; i<x; i++) {
			listArr.add(sc.nextInt());
		}
		
		int min = Collections.min(listArr);
		int max = Collections.max(listArr);
		
		System.out.println(min+" "+max);
		
		sc.close();
	}

}
