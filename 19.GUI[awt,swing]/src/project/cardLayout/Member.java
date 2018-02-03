package project.cardLayout;

import java.io.Serializable;
/*
 * VO(Value Object)�Ǵ� DTO(Data Transfer Object)��� �θ���.
 *		- getter setter �޼ҵ带 ������.
 * 		- ��� 1���� �����͸� ���� �ִ� ��ü
 * 		- ���ڳ� ���ϵ����Ϳ� ���Ǿ �����͸� �Ű��ִ� ����
 */

public class Member implements Serializable{
	//�ߺ��Ǵ� ���� ������ �ȵ�
	private String id; 
	private String password;
	private String name;
	private String address;
	private boolean married;
	
	@Override
	public String toString() {
		//return id + ", " + password + ", " + name + ", " + address + ", " + married;
		return id + "[" + name + "]";
	}
	
	public Member() {
	}
	
	public Member(String id, String password, String name, String address, boolean married) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.married = married;
	}



	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public boolean isMarried() {
		return married;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	
}
