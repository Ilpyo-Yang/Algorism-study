package Greedy;

// 그리?�� ?��고리�?
/*
-- ATM 11399
첫째 줄에 ?��?��?�� ?�� N(1 ?�� N ?�� 1,000)?�� 주어진다. 
?���? 줄에?�� �? ?��?��?�� ?��?�� ?��출하?��?�� 걸리?�� ?���? Pi�? 주어진다. (1 ?�� Pi ?�� 1,000)
*/
import java.util.*;

public class Greedy_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  x = sc.nextInt();
		int[] listArr = new int[x];
		int sum=0;
		
		for (int i=0; i<x; i++) {
			listArr[i]=sc.nextInt();
		}
		sc.nextLine();
		
		Arrays.sort(listArr);
		
		for (int i=0; i<x-1; i++) {
			listArr[i+1]=listArr[i]+listArr[i+1];
			sum+=listArr[i];
		}
		
		
		System.out.println(sum);
		
		sc.close();
	}

}

/*
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min = 0, n = sc.nextInt(), p[] = new int[n+1];
		for (i = 1; i <= n; i++) p[i] = sc.nextInt();
		Arrays.sort(p); //java.util.Arrays?�� ?��?��.
		for (i = 1; i <= n; i++) {
			p[i] = p[i - 1] + p[i];
			min += p[i];
		}
		System.out.println(min);
		sc.close();
	}
}
[출처] [백�?] 11399 - ATM|?��?��?�� occidere 
*/
