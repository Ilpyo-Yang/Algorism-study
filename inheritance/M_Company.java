package inheritance;

import java.util.Scanner;

public class M_Company extends M_Member {

	String jobType;
	String seedMoney;
	
	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getSeedMoney() {
		return seedMoney;
	}

	public void setSeedMoney(String seedMoney) {
		this.seedMoney = seedMoney;
	}

	public void signIn(Scanner sc) {
		System.out.print("\n** ������ ȸ������ **\n"
				+ "1. ���̵� : ");
		setId(sc.nextLine());
		System.out.print("2. ��й�ȣ : ");
		setPasswd(sc.nextLine());
		System.out.print("3. ȸ��� : ");
		setName(sc.nextLine());
		System.out.print("4. ���� : ");
		setJobType(sc.nextLine());
		System.out.print("5. �ں��� : ");
		setSeedMoney(sc.nextLine());
		
	}
	
}
