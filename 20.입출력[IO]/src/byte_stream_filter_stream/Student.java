package byte_stream_filter_stream;

public class Student {
	private int no;
	private String name;
	private String address;
	
	public Student(int no, String name, String address) {
		this.no = no;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString(){
		return no + ", " + name + ", " + address;
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
