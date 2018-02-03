
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		AcademyStudent student1=new AcademyStudent(1,"KIM","OFFICE");
		AcademyStudent student2=new AcademyStudent(2,"GIM","LINUX");
		AcademyStudent student3=new AcademyStudent(3,"SIM","IOT");
		
		AcademyGangsa gangsa1=new AcademyGangsa(4, "HONG", "JAVA");
		AcademyGangsa gangsa2=new AcademyGangsa(5, "PONG", "DESIGN");
		
		AcademyStaff staff1=new  AcademyStaff(6, "JUNG", "MARKETING");
		AcademyStaff staff2=new  AcademyStaff(7, "TONG", "ACCOUNTING");
		
		/*student1.studentPrint();
		student2.studentPrint();
		student3.studentPrint();
		
		gangsa1.gangsaPrint();
		gangsa2.gangsaPrint();
		
		staff1.staffPrint();
		staff2.staffPrint();*/
		
		student1.print();
		student2.print();
		student3.print();
		gangsa1.print();
		gangsa2.print();
		staff1.print();
		staff2.print();
		
		System.out.println();
		System.out.println("--------- array ---------");
		
		
		AcademyStudent[] studentArray=new AcademyStudent[3];
		studentArray[0]=student1;
		studentArray[1]=student2;
		studentArray[2]=student3;
		
		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i].print();
		}
		
		AcademyStaff[] staffArray=new AcademyStaff[2];
		staffArray[0]=staff1;
		staffArray[1]=staff2;
		for (int i = 0; i < staffArray.length; i++) {
			staffArray[i].print();
		}
		AcademyGangsa[] gangsaArray=new AcademyGangsa[2];
		gangsaArray[0]=gangsa1;
		gangsaArray[1]=gangsa2;
		for (int i = 0; i < gangsaArray.length; i++) {
			gangsaArray[i].print();
		}
		
		
		/*
		AcademyStudent sss=
				(AcademyStudent)Class.forName("AcademyStudent").newInstance();
		
		System.out.println(sss);
		*/
		
		
		
		
		
		
		
	}

}
