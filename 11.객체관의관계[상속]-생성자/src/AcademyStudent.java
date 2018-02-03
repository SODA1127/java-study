
public class AcademyStudent extends AcademyMember{

	private String ban; //반
	
	public AcademyStudent() {
		super();
	}
	
	public AcademyStudent(int no, String name, String ban) {
		/*this.no = no;
		this.name = name;*/
		super(no, name);
		this.ban = ban;
	}
	
	/*
	public void pritnt(){
		System.out.println(no + "\t" + name + "\t");
	}
	멤버로부터 상속받은 메소드
	 */
	
	@Override
	public void print(){
		super.print();
		System.out.println(ban);
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
}
