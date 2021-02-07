/*
 	Introduction
 	=> 1byte �⺻ Stream(system.in)�� �̿��� ���ϰ� �ܼ� �� ���� ��� �� ����
 	1. ������(char)�� int�� ����ϱ�
 		Condition
 		// �Է½� ����� ���� ���� char���� ��Ÿ���� �ʴ´�.
 		// cmd���� ctrl+c ������ ���α׷� �����ϵ��� �Ѵ�.
 */

package io;

import java.util.Scanner;

public class Ex_1StreamBasic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ���ܾ �Է��ϼ��� : ");
		String input = sc.nextLine();
		
		char[] inputArr = input.toCharArray();
		
		for (int i=0; i<inputArr.length; i++) {
			//if((int)inputArr[i]!=)
			System.out.println("������ : "+inputArr[i]);
			System.out.println("���ڷ��� ��ȯ : "+(int)inputArr[i]+"\n");
		
		}
		
	}

}

/*
	>> ���ܾ �Է��ϼ��� : dog
	������ : d
	���ڷ��� ��ȯ : 100
	
	������ : o
	���ڷ��� ��ȯ : 111
	
	������ : g
	���ڷ��� ��ȯ : 103
*/
