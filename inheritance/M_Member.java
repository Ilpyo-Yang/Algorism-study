/*
 	Introduction
 	1. Member Ŭ������ �θ�Ŭ������ �ϰ� Empolyee�� Company�� �ڼ�Ŭ������ �ϴ� method Ŭ������ �����Ѵ�
 	2. getter�� setter�� �̿��ϱ�
 	3. ��� �Ӽ��� private ���������ڷ� ����
 	4. �� �Ӽ����� ������ �߰��ؼ� �Է°� �����ϱ�
 	// ������ �ѱ۸� ����(����ǥ������ Ȱ��)
 	// ��й�ȣ�� 8~15������ ��ҹ���, Ư����ȣ, ������ ȥ��
 	// ���̵�, ��й�ȣ, ������ ��� null, ������ �ƴϿ��� �Ѵ�.
 */

package inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ashare.ShareMethod;

public abstract class M_Member {

	private String id;
	private String passwd;
	private String name;
	
	//private �Ӽ� ���� �ٸ� Ŭ�������� �̿��� �� �ֵ��� getter, setter�� �����Ѵ�
	//��� �Ӽ����� get�ؿ��� ���� �Ӽ����� ��� set�� �������� �ۼ�
	
	//�ءء� �� �Ӽ� ���� string���� �������� �� showAll �޼����� ������ ���Ǹ� ������ų �� �ִ�. //�ءء�
	
	public String getId() {
		this.id = id;
		return id;
	} 

	public String setId(String id) {
		if(id!=null && !id.trim().isEmpty()) {
			// ������ ������ ���� ���� �����ϱ� ���ؼ� trim()���� �յ� ������ �����ϰ� isEmpth()�� ���鿩�θ� �Ǵܰ���
			this.id = id;
			return id;
		} else
			return "���̵� �ٽ� �Է����ּ���!!";	
	}

	public String getPasswd() {
		this.passwd = passwd;
		return passwd;
	}

	public String setPasswd(String passwd) {
		boolean bool = ShareMethod.isCheckPwd(passwd);
		if(bool) {
			this.passwd = passwd;
			return passwd;
		} else 
			return "��й�ȣ�� �߸��Ǿ����ϴ�\n"
				+ "��й�ȣ�� ��ҹ���, ����, Ư�����ڰ� ���Ե� 8~15���ڷ� �Է����ּ���!!";
	}

	public String getName() {
		this.name = name;
		return name;
	}

	public String setName(String name) {
		if(name!=null && !name.trim().isEmpty()) {
			Pattern p = Pattern.compile("^[��-�R]{2,5}$");
			Matcher m = p.matcher(name);
			boolean b = m.matches();
			if(b) {
				this.name = name;
				return name;
			}
		} else
			return "������ �ٽ� �Է����ּ���!!";	
		this.name = name;
		return name;
	}	
	
	public abstract void showAll();
}
