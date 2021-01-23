/*
 	Introduction
 	1. Member�� ����Ŭ������ �ް� private �Ӽ� �ϳ��� �� �߰��Ѵ�
 	// �߰� �Ӽ��� �ֹ��� null�̳� ���鰪�� �ƴϿ��� �ϸ�, �ֹε�Ϲ�ȣ �� 7�ڸ��� �Էµ� �� �ֵ��� ����ǥ������ �̿��Ѵ�
 	2. getter�� setter�� �̿��ϱ�
 	3.
 	
 */

package inheritance;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M_Employee extends M_Member {

	private String jubun;

	public String getJubun() {
		return jubun;
	}

	public void setJubun(String jubun) {
		if(jubun!=null && jubun.trim().isEmpty()) 
			System.out.println("�ֹε�Ϲ�ȣ�� �ٸ��� �Է����ּ���!!\n"
					+ "�ֹε�Ϲ�ȣ�� �տ������� 7�ڸ��� �Է����ּ���!!");

		Pattern p = Pattern.compile("^[1-9][0-9][0-1][0-9][0-3][0-9][1-4]$");
		Matcher m = p.matcher(jubun);
		boolean b = m.matches();
		if(b) 
			this.jubun = jubun;
		else
			System.out.println("�ֹε�Ϲ�ȣ�� �ٸ��� �Է����ּ���!!\n"
					+ "�ֹε�Ϲ�ȣ�� �տ������� 7�ڸ��� �Է����ּ���!!");
	}
	
	public void signIn(Scanner sc) {
		System.out.print("\n** ������ ȸ������ **\n"
				+ "1. ���̵� : ");
		setId(sc.nextLine());
		System.out.print("2. ��й�ȣ : ");
		setPasswd(sc.nextLine());
		System.out.print("3. ���� : ");
		setName(sc.nextLine());
		System.out.print("4. �ֹε�Ϲ�ȣ ��  7�ڸ� : ");
		setJubun(sc.nextLine());
		
	}
}
