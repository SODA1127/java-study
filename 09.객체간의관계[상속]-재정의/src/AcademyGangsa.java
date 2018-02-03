
public class AcademyGangsa extends AcademyMember{
	public String subject; //과목
	public AcademyGangsa() {
	
	}
	public AcademyGangsa(int no, String name, String subject) {
		this.no = no;
		this.name = name;
		this.subject = subject;
	}
	
	public void print(){
		super.print();
		System.out.println(subject);
	}
	
	public String getSbject() {
		return subject;
	}
	public void setSbject(String subject) {
		this.subject = subject;
	}
	
	
	
	
}
