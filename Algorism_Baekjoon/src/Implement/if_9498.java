package Implement;

// if�? 9498
/*
- ?��?��?��?�� 9498
?��?�� ?��?���? ?��?��받아 90 ~ 100?��?? A, 80 ~ 89?��?? B, 70 ~ 79?��?? C, 60 ~ 69?��?? D, ?��머�? ?��?��?�� F�? 출력?��?�� ?��로그?��?�� ?��?��?��?��?��.
*/

import java.util.Scanner;

public class if_9498 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(90<=x && x<=100) System.out.println("A");
		else if(80<=x) System.out.println("B");
		else if(70<=x) System.out.println("C");
		else if(60<=x) System.out.println("D");
		else System.out.println("F");
		
		sc.close();
	}
	
}
