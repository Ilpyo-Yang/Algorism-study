package Implement;

// 배열
/*
-- ?��머�? 3052
첫째 줄�??�� ?��번째 �? 까�? ?��?���? ?�� 줄에 ?��?��?�� 주어진다. 
?�� ?��?��?�� 1,000보다 ?��거나 같고, ?��?�� ?��?�� ?��?��?��?��.
첫째 줄에, 42�? ?��?��?��?�� ?��, ?���? ?���? ?��머�?�? �? �? ?��?���? 출력?��?��.
*/
import java.util.*;

public class Array_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = new ArrayList<>();
		List<Integer> remainder = new ArrayList<>();
		int cnt = 0;
		
		for (int i=0; i<10; i++) {
			input.add(sc.nextInt());
			remainder.add(input.get(i)%42);
		}
		sc.nextLine();
		
		for (int i=0; i<remainder.size()-1; i++) {
			for (int j=i+1; j<remainder.size(); j++) {
				if(remainder.get(i)==remainder.get(j)) {
					cnt++;
					break;
				}
			}
		}
		
		System.out.println(10-cnt);
	
		sc.close();
	}
}
