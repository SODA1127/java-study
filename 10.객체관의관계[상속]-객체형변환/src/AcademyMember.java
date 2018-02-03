
public class AcademyMember {
	public int no;
	public String name;
	
	public AcademyMember() {
	}
	
	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public void print(){
		System.out.print(no + "\t" + name + "\t");
	}
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
