package Implement;

// 문자?�� 2675
/*
--
문자?�� S�? ?��?��받�? ?��?��, �? 문자�? R�? 반복?�� ?�� 문자?�� P�? 만든 ?�� 출력?��?�� ?��로그?��?�� ?��?��?��?��?��. 
�?, �? 번째 문자�? R�? 반복?���?, ?�� 번째 문자�? R�? 반복?��?�� ?��?���? P�? 만들�? ?��?��. S?��?�� QR Code "alphanumeric" 문자�? ?��?��?��?��.
QR Code "alphanumeric" 문자?�� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: ?��?��.
*/

import java.util.Scanner;

public class string_2675 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String s = sc.nextLine();

		char[] chArr = s.toCharArray();
	
		for (int i = 1; i < chArr.length; i++) {
			for (int j = 0; j < cnt; j++) {
				System.out.print(chArr[i]);			
			}
		}
		
		
		sc.close();
	}
	
}
