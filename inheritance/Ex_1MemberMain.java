package inheritance;

import java.util.*;

public class Ex_1MemberMain {

	public static void main(String[] args) {
		
		M_Company co = new M_Company();
		M_Employee em = new M_Employee();
		M_Member me = new M_Member();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			System.out.println("======  >>  ���θ޴�  <<  ======== \n" + 
								"1. ������ ȸ������    2. ����ȸ�� ȸ������ \n"+ 
								"3. ������ �α���       4. ����ȸ�� �α��� \n" + 
								"5. ��� ������ ���   6. ��� ����ȸ�� ��� \n"+ 
								"7. �α׾ƿ�              8. ���α׷� ����\n");
			System.out.print("�� �޴��� �������ּ��� => ");
			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				
				break;

			default:
				break;
			}
		} while (true);
		
		
	}

}
