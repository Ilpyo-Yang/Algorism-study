package Implement;

// 문자?��
/*
-- ?��?��?�� 개수 1152
?��?�� ???��문자?? ?��?��?��기만?���? ?��루어�? 문자?��?�� 주어진다. ?�� 문자?��?��?�� �? 개의 ?��?���? ?��?���?? 
?���? 구하?�� ?��로그?��?�� ?��?��?��?��?��. 
?��, ?�� ?��?���? ?��?�� �? ?��?��?���? ?��?��?�� ?��?��만큼 모두 ?��?��?�� ?��?��.
*/
import java.util.*;

public class String_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt=0;
		int last = str.length();
		
		if(str.charAt(0)==' ') cnt--;
		if(str.charAt(last-1)==' ') cnt--;
		
		for (int i=0; i<last; i++) {
			if(str.charAt(i)==' ')
				cnt++;				
		}	
		
		System.out.println(cnt+1);
		sc.close();
	}
}
