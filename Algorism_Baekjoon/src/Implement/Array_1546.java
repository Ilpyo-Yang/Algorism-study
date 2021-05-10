package Implement;

// 배열
/*
-- ?���? 1546
?���??��?�� 기말고사�? 망쳤?��. ?���??��?�� ?��?���? 조작?��?�� 집에 �??���?기로 ?��?��. 
?��?�� ?���??��?�� ?���? ?��?�� 중에 최댓값을 골랐?��. ?�� 값을 M?��?���? ?��?��. 
그리�? ?��?�� 모든 ?��?���? ?��?��/M*100?���? 고쳤?��.

?���? ?��?��, ?���??��?�� 최고?��?�� 70?���?, 
?��?��?��?���? 50?��?��?���? ?��?��?��?��?�� 50/70*100?�� ?��?�� 71.43?��?�� ?��?��.

?���??��?�� ?��?��?�� ?��?�� 방법??�? ?���? 계산?��?�� ?��, ?��로운 ?��균을 구하?�� ?��로그?��?�� ?��?��?��?��?��.
*/
import java.util.*;

public class Array_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double max=0, sum=0; 
		double[] arr = new double[x];
		
		for (int i=0; i<x; i++) {
			arr[i]=sc.nextDouble();
			if(arr[i]>max)
				max=arr[i];
		}
		
		for (int i=0; i<x; i++) {
			arr[i]=arr[i]/max*100;
			sum += arr[i];
		}
		
		System.out.println(sum/x);
		
		sc.close();
	}
}

/*
?�� ???��?���? 모르?�� ?��?�� ?��
import java.util.*;

public class Array_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double sum=0; 
		List<Double> listArr = new ArrayList<>();
		List<Double> newlistArr = new ArrayList<>();
		
		for (int i=0; i<x; i++) {
			listArr.add(sc.nextDouble());
		}
		
		double max = Collections.max(listArr);
		
		for (int i=0; i<x; i++) {
			newlistArr.add(listArr.get(i)/(double)max*100);

		}
		
		for (int i=0; i<x; i++) {
			System.out.println(newlistArr.get(i));
			sum += newlistArr.get(i);
		}
		
		System.out.println(sum/x);
		
		sc.close();
	}

}
 
*/
 */