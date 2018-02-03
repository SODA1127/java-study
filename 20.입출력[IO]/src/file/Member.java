package file;

import java.io.Serializable;

public class Member implements Serializable{
	//중복되는 값을 가지면 안됨
	private String id; 
	private String password;
	private String name;
	private String address;
	private boolean married;
	
	@Override
	public String toString() {
		return id + ", " + password + ", " + name + ", " + address + ", " + married;
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
