package Implement;

//for�?
/*
- x보다 ?��?? ?�� 10871
첫째 줄에 N�? X�? 주어진다. (1 ?�� N, X ?�� 10,000)
?���? 줄에 ?��?�� A�? ?��루는 ?��?�� N개�? 주어진다. 주어�??�� ?��?��?�� 모두 1보다 ?��거나 같고, 10,000보다 ?��거나 같�? ?��?��?��?��.
X보다 ?��?? ?���? ?��?��받�? ?��?��??�? 공백?���? 구분?�� 출력?��?��. X보다 ?��?? ?��?�� ?��?��?�� ?��?�� 존재?��?��.
*/

import java.util.Scanner;

public class for_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a<x) System.out.print(a+" ");
		}
		
	    sc.close();
	}

}
