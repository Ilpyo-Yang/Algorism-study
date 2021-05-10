package Greedy;


// 그리?�� ?��고리�?
/*
- ?��?��0 11047
�?규�? �?�?�? ?��?�� ?��?��?? �? N종류?���?, 각각?�� ?��?��?�� 매우 많이 �?�?�? ?��?��.
?��?��?�� ?��?��?�� ?��?��?��?�� �? �?치의 ?��?�� K�? 만들?���? ?��?��. 
?��?�� ?��?��?�� ?��?�� 개수?�� 최솟값을 구하?�� ?��로그?��?�� ?��?��?��?��?��.

첫째 줄에 N�? K�? 주어진다. (1 ?�� N ?�� 10, 1 ?�� K ?�� 100,000,000)
?���? 줄�??�� N개의 줄에 ?��?��?�� �?�? Ai�? ?��름차?��?���? 주어진다. 
(1 ?�� Ai ?�� 1,000,000, A1 = 1, i ?�� 2?�� 경우?�� Ai?�� Ai-1?�� 배수)
*/

import java.util.Scanner;

public class greedy_11047 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int sum = 0;
		
		int[] moneyArr = new int[n+1];
		
		for (int i=0; i<n; i++) moneyArr[i]=sc.nextInt();
		for (int i=n; i>0; i--) {
			if(moneyArr[i]!=0) {
				sum += k/moneyArr[i];
				k=k%moneyArr[i];
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, m = 0, n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n + 1];
		for (i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(i=n;i>0;i--){
			m+=k/a[i];
            k%=a[i];
		}
		System.out.println(m);
        sc.close();
	}
} 
*/
