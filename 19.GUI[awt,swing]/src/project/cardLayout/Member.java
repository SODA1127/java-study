package project.cardLayout;

import java.io.Serializable;
/*
 * VO(Value Object)또는 DTO(Data Transfer Object)라고 부른다.
 *		- getter setter 메소드를 가진다.
 * 		- 멤버 1명의 데이터를 갖고 있는 객체
 * 		- 인자나 리턴데이터에 사용되어서 데이터를 옮겨주는 역할
 */

public class Member implements Serializable{
	//중복되는 값을 가지면 안됨
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
