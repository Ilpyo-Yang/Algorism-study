package Implement;

// 배열
/*
-- ?��균�? ?��겠�? 4344
첫째 줄에?�� ?��?��?�� �??��?��?�� 개수 C�? 주어진다.
?���? 줄�??�� �? ?��?��?�� �??��?��마다 ?��?��?�� ?�� N(1 ?�� N ?�� 1000, N?? ?��?��)?�� �? ?���? 주어�?�?, 
?��?��?�� N명의 ?��?���? 주어진다. ?��?��?�� 0보다 ?��거나 같고, 100보다 ?��거나 같�? ?��?��?��?��.
*/
import java.util.*;

public class Array_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		double sum=0;
		int num=0;
		int[] scoreArr = null;
		
		for (int j=0; j<testcase; j++) {
			int student = sc.nextInt();
			
			for (int i=0; i<student; i++) {
				scoreArr = new int[student];
				scoreArr[i]=sc.nextInt();
				sum += scoreArr[i];
			}
				
			for (int i=0; i<student; i++) {
				System.out.println(scoreArr[i]);
				if(scoreArr[i]>sum/student) {
					num++;
				}	
			}
			
			System.out.printf("%.3f",num/student*100);
			System.out.println("%");
		}
		
		
		sc.close();
	}

}
