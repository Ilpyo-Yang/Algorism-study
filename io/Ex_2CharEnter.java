/*
	Introduction
 	=> Enter Ű�� ������ ������ ���ڷ��� ��ȯ
 	1. ������(char)�� int�� ����ϱ�
 		Condition
 		// Scanner ������ �ۼ�
 		// �Է½� ����� ���� ���� char���� ��Ÿ���� �ʴ´�.
 		// cmd���� ctrl+c ������ ���α׷� �����ϵ��� �Ѵ�.
 */

package io;

import java.io.IOException;

public class Ex_2CharEnter {

	public static void main(String[] args) {
		
		int input = 0;
	
		try {
			while ((input=System.in.read())!=-1) {
				if((int)input!=13 && (int)input!=10) {
					System.out.println("\n������ : "+(char)input);
					System.out.println("���ڷ��� ��ȯ : "+(int)input);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

/*
	beautiful
	
	������ : b
	���ڷ��� ��ȯ : 98
	
	������ : e
	���ڷ��� ��ȯ : 101
	
	������ : a
	���ڷ��� ��ȯ : 97
	
	������ : u
	���ڷ��� ��ȯ : 117
	
	������ : t
	���ڷ��� ��ȯ : 116
	
	������ : i
	���ڷ��� ��ȯ : 105
	
	������ : f
	���ڷ��� ��ȯ : 102
	
	������ : u
	���ڷ��� ��ȯ : 117
	
	������ : l
	���ڷ��� ��ȯ : 108
*/
