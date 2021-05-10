package Bruthforce;

/*
-- 블랙?�� 2798
첫째 줄에 카드?�� 개수 N(3 ?�� N ?�� 100)�? M(10 ?�� M ?�� 300,000)?�� 주어진다. 
?���? 줄에?�� 카드?�� ?��?�� ?��?�� ?���? 주어�?�?, ?�� 값�? 100,000?�� ?���? ?��?�� ?��?�� ?��?��?��?��.
?��?�� M?�� ?���? ?��?�� 카드 3?��?�� 찾을 ?�� ?��?�� 경우�? ?��?��?���? 주어진다.

첫째 줄에 M?�� ?���? ?��?��면서 M?�� 최�??�� �?까운 카드 3?��?�� ?��?�� 출력?��?��.

?��?��?�� ?���?�? ?��?�� ?��?�� ?��?��?�� for문의 ?��?��값을 ?�� ?��각하�?!
*/

// 

//

//
 

import java.util.*;

public class bruteforce_2798 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardnum = sc.nextInt();
		int value = sc.nextInt();
		int max = 0, sum = 0;
		int[] intArr = new int[cardnum];
		
		
		for (int i=0; i<intArr.length; i++) {
			intArr[i]=sc.nextInt();
		}
		sc.nextLine();
		
		for (int i=0; i<intArr.length-2; i++) {
			for (int j=i+1; j<intArr.length-1; j++) {
				for (int l=j+1; l<intArr.length; l++) {
					sum = intArr[i]+intArr[j]+intArr[l];
					if (sum<=value) max = Math.max(max,sum);
				}
			}
			
		}
		
		System.out.print(max);
		sc.close();		
	}
	
}