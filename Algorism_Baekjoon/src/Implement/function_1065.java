package Implement;

//?��?��, 브루?��?��?�� ?��고리�?
/*
- ?��?�� 1065
?��?�� ?��?�� ?��?�� X?�� �? ?��리�? ?��차수?��?�� ?��룬다�?, �? ?���? ?��?��?���? ?��?��. ?��차수?��?? ?��?��?�� ?�� 개의 ?��?�� 차이�? ?��?��?�� ?��?��?�� 말한?��. 
N?�� 주어졌을 ?��, 1보다 ?��거나 같고, N보다 ?��거나 같�? ?��?��?�� 개수�? 출력?��?�� ?��로그?��?�� ?��?��?��?��?��. 
첫째 줄에 1,000보다 ?��거나 같�? ?��?��?�� N?�� 주어진다.
첫째 줄에 1보다 ?��거나 같고, N보다 ?��거나 같�? ?��?��?�� 개수�? 출력?��?��.
https://steemit.com/kr-dev/@gyeryak/easyalgo-2-bruteforce
*/

import java.util.Scanner;

public class function_1065 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int hansu = 0;
		
		for(int i=1;i<input+1;i++) {
			if(cnt(i)<3) hansu++; 
			else if(i/100+i%10==i/10%10*2) hansu++;
		}
		System.out.println(hansu);
		sc.close();
	}
	
	public static int cnt(int x) {
		int a = 1;
		for(int j=0; x/10!=0; j++) {
		    a++;	
			x=x/10;
		}
	return a;
	}	
}
