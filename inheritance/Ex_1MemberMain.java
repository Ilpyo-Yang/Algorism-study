/*
 	Introduction
 	
 	======  >>  ���θ޴�  <<  ======== 
	1. ������ ȸ������    2. ����ȸ�� ȸ������ 
	3. ������ �α���       4. ����ȸ�� �α��� 
	5. ��� ������ ���   6. ��� ����ȸ�� ��� 
	7. �α׾ƿ�              8. ���α׷� ����
	
	1. �ش� ���α׷��� ����ǵ��� �����
	2. �����ڿ� ����ȸ�� 2���� �迭�� �̸� ����ϱ�
 */

package inheritance;

import java.util.*;

public class Ex_1MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		M_Company[] coArr = new M_Company[5];
		M_Employee[] emArr = new M_Employee[5];
		M_CtrlMember ctrl = new M_CtrlMember();
		
		M_Employee em1 = new M_Employee();
		em1.setId("abc");
		em1.setPasswd("123qerAW---");
		em1.setName("����");
		em1.setJubun("9712121");
		emArr[0] = em1;
		em1.ecount++;
		
		M_Employee em2 = new M_Employee();
		em2.setId("def");
		em2.setPasswd("54qerW///");
		em2.setName("����");
		em2.setJubun("8712121");
		emArr[1] = em2;
		em2.ecount++;
		
		M_Company co1 = new M_Company();
		co1.setId("CJE&M");
		co1.setPasswd("q3weAD8+8");
		co1.setName("CJ");
		co1.setJobType("�����ž�");
		coArr[0] = co1;
		co1.ccount++;
		
		M_Company co2 = new M_Company();
		co2.setId("Microsoft");
		co2.setPasswd("q3wefgA+8");
		co2.setName("Microsoft");
		co2.setJobType("IT");
		coArr[1] = co2;
		co2.ccount++;

				
		do {
			System.out.println("\n=====  >>  ���θ޴�  <<  ======== \n" + 
								"1. ������ ȸ������    2. ����ȸ�� ȸ������ \n"+ 
								"3. ������ �α���       4. ����ȸ�� �α��� \n" + 
								"5. ��� ������ ���   6. ��� ����ȸ�� ��� \n"+ 
								"7. �α׾ƿ�              8. ���α׷� ����\n");
			System.out.print("�� �޴��� �������ּ��� => ");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				ctrl.signInEmloyee(sc, emArr);
				break;
				
			case "2":
				ctrl.signInCompany(sc, coArr);
				break;
				
			case "5":
				ctrl.printEmloyee(emArr);
				break;
				
			case "6":
				ctrl.printCompany(coArr);
				break;

			default:
				break;
			}
		} while (true);
		
		
	}

}
