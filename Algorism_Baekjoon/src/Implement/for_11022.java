package Implement;

//for�?
/*
- A+B - 8 11022
첫째 줄에 ?��?��?�� �??��?��?�� 개수 T�? 주어진다.

�? ?��?��?�� �??��?��?�� ?�� 줄로 ?��루어?�� ?��?���?, �? 줄에 A?? B�? 주어진다. (0 < A, B < 10)
�? ?��?��?�� �??��?��마다 "Case #x: A + B = C" ?��?��?���? 출력?��?��. x?�� ?��?��?�� �??��?�� 번호?���? 1�??�� ?��?��?���?, C?�� A+B?��?��.
*/

/*
import java.io.*;

public class for_11022 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i=0;i<cnt;i++) {
				int a = br.read();
				int b = br.read();
				System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
			}
			br.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
*/


import java.util.Scanner;

public class for_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a+b);
		}
		
	}

}
