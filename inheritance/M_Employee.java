/*
 	Introduction
 	1. Member�� ����Ŭ������ �ް� private �Ӽ� �ϳ�(jubun)�� �� �߰��Ѵ�
 	2. getter�� setter�� �̿��ϱ� 
 	// �߰� �Ӽ��� �ֹ��� null�̳� ���鰪�� �ƴϿ��� �ϸ�, �ֹε�Ϲ�ȣ �� 7�ڸ��� �Էµ� �� �ֵ��� ����ǥ������ �̿��Ѵ�
 		
 */

package inheritance;

import java.util.*;
import java.util.regex.*;

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
	
	@Override
	public void showAll() {
		System.out.println("\n1. ���̵� : "+getId()+"\n"
				          +"2. ��ȣ : "+getPasswd()+"\n"
					      +"3. ���� : "+getName()+"\n"
					      +"4. �ֹε�Ϲ�ȣ �� 7�ڸ� : "+getJubun());
	}
}
