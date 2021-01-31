package inheritance;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M_Company extends M_Member {

	public static int ccount;
	
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

	public void setSeedMoney(long seedMoney) {
		try {
			DecimalFormat df = new DecimalFormat();
			this.seedMoney = df.format(seedMoney);
		} catch (NumberFormatException e) {
			System.out.println("�ݾ��� �ٸ��� ǥ�����ּ���!");
		}
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
		setSeedMoney(Long.parseLong(sc.nextLine()));
	}
	
	@Override
	public void showAll() {
		System.out.println("\n1. ���̵� : "+getId()+"\n"
				         +"2. ��ȣ : "+getPasswd()+"\n"
					     +"3. ȸ��� : "+getName()+"\n"
					     +"4. ���� : "+getJobType()+"\n"
					     +"5. �ں��� : "+getSeedMoney());
	}
	
}
