
public class AcademyMemberCastingMain {

	public static void main(String[] args) {
		AcademyMember m1 = new AcademyStudent(1,"KIM","OFFICE");
		AcademyMember m2 = new AcademyStudent(2,"GIM","LINUX");
		AcademyMember m3 = new AcademyStudent(3,"SIM","IOT");
		
		AcademyMember m4 = new AcademyGangsa(4, "HONG", "JAVA");
		AcademyMember m5 = new AcademyGangsa(5, "PONG", "DESIGN");
		
		AcademyMember m6 = new  AcademyStaff(6, "JUNG", "MARKETING");
		AcademyMember m7 = new  AcademyStaff(7, "TONG", "ACCOUNTING");
		
		/*student1.studentPrint();
		student2.studentPrint();
		student3.studentPrint();
		
		gangsa1.gangsaPrint();
		gangsa2.gangsaPrint();
		
		staff1.staffPrint();
		staff2.staffPrint();*/
		
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
		
		System.out.println();
		System.out.println("--------- array ---------");
		AcademyMember[] academyMember = new AcademyMember[7];
		academyMember[0] = m1;
		academyMember[1] = m2;
		academyMember[2] = m3;
		academyMember[3] = m4;
		academyMember[4] = m5;
		academyMember[5] = m6;
		academyMember[6] = m7;
		
		for (int i = 0; i < academyMember.length; i++) {
			academyMember[i].print();
		}
		
		System.out.println("--------- instanceof ---------");
		/*
		 * 		- instanceof 연산자
		 * boolean b = 참조변수 instanceof 클래스이름
		 * 
		 */
		
		if(m1 instanceof AcademyStudent){
			System.out.println(m1);
			AcademyStudent temp = (AcademyStudent) m1;
			String ban = temp.getBan();
			System.out.println("ban : " + ban);
		}
		
		System.out.println("--------------------------------------------------");
		for (int i = 0; i < academyMember.length; i++) {
			if(academyMember[i] instanceof AcademyStudent){
				AcademyStudent temp = (AcademyStudent)academyMember[i];
				System.out.println("Student : " + temp.getBan());
			}
			else if(academyMember[i] instanceof AcademyGangsa){
				AcademyGangsa temp = (AcademyGangsa)academyMember[i];
				System.out.println("Gangsa : " + temp.getSbject());
			}
			else if(academyMember[i] instanceof AcademyStaff){
				AcademyStaff temp = (AcademyStaff)academyMember[i];
				System.out.println("Staff : " + temp.getDepart());
			}
			else{
				
			}
		}
	}

}
