package Implement;

// 배열
/*
-- 최댓�? 2562
첫째 줄�??�� ?��?�� 번째 줄까�? ?�� 줄에 ?��?��?�� ?��?��?���? 주어진다. 
주어�??�� ?��?��?��?�� 100 보다 ?��?��.
첫째 줄에 최댓값을 출력?���?, ?���? 줄에 최댓값이 �? 번째 ?��?���?�? 출력?��?��.
*/
import java.util.*;

public class Array_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listArr = new ArrayList<>();
		int no = 0;
		
		for (int i=0; i<9; i++) {
			listArr.add(sc.nextInt());
		}
		
		int max = Collections.max(listArr);
		
		for (int i=0; i<9; i++) {
			if(listArr.get(i)==max) {
				no=i;
				break;
			}
		}
		
		
		System.out.println(max);
		System.out.println(no+1);
		
		sc.close();
	}

}
