package inheritance;

import java.util.*;

public class M_CtrlMember {
	
	M_Employee em = new M_Employee();
	M_Company co = new M_Company();
	
	
	public void signInEmloyee(Scanner sc, M_Employee[] emArr) {
		
		System.out.println("\n** ������ ȸ������ **\n");
		
		outId:
		do {
			System.out.print("1. ���̵� : ");
			String id = sc.nextLine();
						
			for (int i=0; i<em.ecount; i++) {
				if(!id.equals(emArr[i].getId())) {
					em.setId(id);
					id = em.getId();
					if(id==null) continue outId;
				} else {
					System.out.println("�Էµ� ���̵�� �̹� ��ϵ� ���̵��Դϴ�. �ٸ� ���̵� �Է����ּ���!");
					continue outId;	
				}
			}
			break;
		} while(true);
		
		
		do {
			System.out.print("2. ��й�ȣ : ");
			String passwd = sc.nextLine();
			em.setPasswd(passwd);
			passwd = em.getPasswd();
			if(passwd==null) continue;
			break;
		} while(true);

		
		do {
			System.out.print("3. ���� : ");
			String name = sc.nextLine();
			em.setName(name);
			name = em.getName();
			if(name==null) continue;
			break;
		} while(true);
		
		
		do {
			System.out.print("4. �ֹε�Ϲ�ȣ ��  7�ڸ� : ");
			String jubun = sc.nextLine();
			em.setJubun(jubun);
			jubun = em.getJubun();
			if(jubun==null) continue;
			break;
		} while(true);
		
		emArr[em.ecount] = em;
			
	}
	
	
	public void signInCompany(Scanner sc, M_Company[] coArr) {
		
		System.out.println("\n** ����ȸ�� ȸ������ **\n");
		
		outId:
		do {
			System.out.print("1. ���̵� : ");
			String id = sc.nextLine();
						
			for (int i=0; i<co.ccount; i++) {
				if(!id.equals(coArr[i].getId())) {
					co.setId(id);
					id = co.getId();
					if(id==null) continue outId;
				} else {
					System.out.println("�Էµ� ���̵�� �̹� ��ϵ� ���̵��Դϴ�. �ٸ� ���̵� �Է����ּ���!");
					continue outId;	
				}
			}
			break;
		} while(true);
		
		
		do {
			System.out.print("2. ��й�ȣ : ");
			String passwd = sc.nextLine();
			co.setPasswd(passwd);
			passwd = co.getPasswd();
			if(passwd==null) continue;
			break;
		} while(true);

		
		do {
			System.out.print("3. ȸ��� : ");
			String name = sc.nextLine();
			co.setName(name);
			name = co.getName();
			if(name==null) continue;
			break;
		} while(true);
		
		
		do {
			System.out.print("4. ���� : ");
			String jobType = sc.nextLine();
			co.setJobType(jobType);
			jobType = co.getJobType();
			if(jobType==null) continue;
			break;
		} while(true);
		
		
		do {
			System.out.print("5. �ں��� : ");
			String seedMoney = sc.nextLine();
			co.setSeedMoney(Long.parseLong(seedMoney));
			seedMoney = co.getSeedMoney();
			if(seedMoney==null) continue;
			break;
		} while(true);
		
		 coArr[co.ccount] = co;
			
	}
	
	
	public void printEmloyee(M_Employee[] emArr) {
		System.out.println("\n�� ������ �� : "+em.ecount);
		for (int i=0; i<em.ecount; i++) {
			emArr[i].showAll();
		}
	}
	
	
	public void printCompany(M_Company[] coArr) {
		System.out.println("\n�� ����ȸ�� �� : "+co.ccount);
		for (int i=0; i<co.ccount; i++) {
			coArr[i].showAll();
		}
	}
	
	M_Employee emDB = null;
	M_Company coDB = null;
	
	public M_Employee loginEmployee(Scanner sc, M_Employee[] emArr) {
		
		System.out.println("\n** ������ �α��� **\n");

		do {
		System.out.print("1. ���̵� : ");
		String id = sc.nextLine();
		System.out.print("2. ��ȣ : ");
		String passwd = sc.nextLine();
					
		for (int i=0; i<em.ecount; i++) {
			if(id.equals(emArr[i].getId())) {
				if(passwd.equals(emArr[i].getPasswd())) {
						System.out.println("\n"+emArr[i].getName()+" ������ �α��εǾ����ϴ�!");
						emArr[i].showAll();
						return emDB = emArr[i];
				} else
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���!");
			} else 
				System.out.println("�Էµ� ���̵� ���� �����ڴ� �����ϴ�. �ٽ� �Է����ּ���!");
		}
		} while(true);
	}
	
	
	public M_Company loginCompany(Scanner sc, M_Company[] coArr) {
		
		System.out.println("\n** ����ȸ�� �α��� **\n");

		do {
		System.out.print("1. ���̵� : ");
		String id = sc.nextLine();
		System.out.print("2. ��ȣ : ");
		String passwd = sc.nextLine();
					
		for (int i=0; i<co.ccount; i++) {
			if(id.equals(coArr[i].getId())) {
				if(passwd.equals(coArr[i].getPasswd())) {
						System.out.println("\n"+coArr[i].getName()+" ������ �α��εǾ����ϴ�!");
						coArr[i].showAll();
						return coDB = coArr[i];
				} else
					System.out.println("��ȣ�� �߸��Ǿ����ϴ�. �ٽ� �Է����ּ���!");
			} else 
				System.out.println("�Էµ� ���̵� ���� ����ȸ��� �����ϴ�. �ٽ� �Է����ּ���!");
		}
		} while(true);
	}
	
	
	public void logout(M_Employee[] emArr, M_Company[] coArr) {
		if(emDB!=null) {
			System.out.println(emDB.getName()+"���� �α׾ƿ� �Ǿ����ϴ�.");
			emDB = null;
		} else {
			System.out.println(coDB.getName()+"�α׾ƿ� �Ǿ����ϴ�.");
			coDB = null;
		}
	}
}
