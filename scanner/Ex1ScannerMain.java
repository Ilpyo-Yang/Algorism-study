/*
 	Introduction
 	1. Scanner�� �� ����, ��Ģ������ �Է¹ޱ�
 	2. Method�� �̿��ؼ� MainŬ�������� �������ϱ�
 	   //***main�޼����� ����� answer�޼��带 �����ϱ� ���� �Ķ���͸� �̿��� Ÿ���� ������� �Ѵ�
 	   //***Ŭ������.�޼����(�Ķ����)���� �޼��� ����ϱ�
 */

package scanner;

import java.util.Scanner;

public class Ex1ScannerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cal, num1, num2;
		
		System.out.print("ù��° ���� => ");
		num1 = sc.nextLine();
		
		System.out.print("�ι�° ���� => ");
		num2 = sc.nextLine();
		
		System.out.print("����ȣ => ");
		cal = sc.nextLine();
		
		System.out.println(Method.answer(sc, cal, num1, num2));
		
		sc.close();
	}

}
