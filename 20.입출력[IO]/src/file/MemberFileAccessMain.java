package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberFileAccessMain {

	//@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		File membersFile = new File("members.ser");
		/************* 초기화 *************/
		if(!membersFile.exists()){
			membersFile.createNewFile();
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(membersFile));
			ArrayList<Member> memberList = new ArrayList<Member>();
			oos.writeObject(memberList);
			oos.close();
		}
		/************* 초기화 *************/
		
		/************* Member 저장(Create) *************/
		/*###### 읽기 ######*/
		Member member1 = new Member("xxxx", "1111", "KIM", "경기도", true);
		ObjectInputStream ois1 =
				new ObjectInputStream(new FileInputStream(membersFile)); 
		ArrayList<Member> memberList = 
				(ArrayList<Member>) ois1.readObject();//읽기
		/*################*/
		
		boolean isDuplicate = false;
		for (int i = 0; i < memberList.size(); i++) {
			Member tempMember = memberList.get(i);
			if(tempMember.getId().equals(member1.getId())){
				// id중복
				System.out.println(member1.getId() + "는 중복입니다.");
				isDuplicate = true;
				break;
			}
		}
		if(!isDuplicate){
			/*###### 쓰기  ######*/
			memberList.add(member1); //쓰기
			ObjectOutputStream oos1 =
					new ObjectOutputStream(new FileOutputStream(membersFile));
			oos1.writeObject(memberList);
			oos1.close();
			/*###### 쓰기  ######*/
		}
		
		/************* Member 수정(Update) *************/
		ObjectInputStream ois3 =
				new ObjectInputStream(new FileInputStream(membersFile));
		ArrayList<Member> memberList3 =
				(ArrayList<Member>) ois3.readObject();
		
		Member updateMember =
				new Member("xxxx", "342321", "KIM수정", "서울", false);
		for (int i = 0; i < memberList3.size(); i++) {
			Member tempMember = memberList3.get(i);
			if(tempMember.getId().equals(updateMember.getId())){
				tempMember.setPassword(updateMember.getPassword());
				tempMember.setName(updateMember.getName());
				tempMember.setAddress(updateMember.getAddress());
				tempMember.setMarried(updateMember.isMarried());
				System.out.println("수정 성공");
				break;
			}
		}
		
		ObjectOutputStream oos3 =
				new ObjectOutputStream(new FileOutputStream(membersFile));
		oos3.writeObject(memberList3);
		oos3.close();
		
		/************* Member ID로 삭제(Delete) *************/
		/*###### 읽기 ######*/
		ObjectInputStream ois4 =
				new ObjectInputStream(new FileInputStream(membersFile)); 
		ArrayList<Member> memberList4 = 
				(ArrayList<Member>) ois4.readObject();//읽기
		ois4.close();
		/*################*/
		String deleteId = "yyyy";
		
		for (int i = 0; i < memberList4.size(); i++) {
			Member temMember = memberList4.get(i);
			if(temMember.getId().equals(deleteId)){
				System.out.println(deleteId + "님 삭제");
				break;
			}
		}
		/*###### 쓰기  ######*/
		memberList.add(member1); //쓰기
		ObjectOutputStream oos4 =
				new ObjectOutputStream(new FileOutputStream(membersFile));
		oos4.writeObject(memberList4);
		oos4.close();
		/*###### 쓰기  ######*/
		
		/************* Member id로 1개 읽기 *************/
		ObjectInputStream ois5 = new ObjectInputStream(new FileInputStream(membersFile));
		ArrayList<Member> memberList5 = (ArrayList<Member>) ois5.readObject();
		ois5.close();
		/////////////
		String findId = "yyyy";
		for (int i = 0; i < memberList5.size(); i++) {
			Member temMember = memberList5.get(i);
			if(temMember.getId().equals(findId)){
				System.out.println("yyyy찾음");
				System.out.println(memberList5.get(i));
				break;
			}
		}
		
		/************* Member 전체읽기(Read) *************/
		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(membersFile)); 
		ArrayList<Member> memberList2 = (ArrayList<Member>) ois2.readObject();
		System.out.println("/************* Member 전체읽기(Read) *************/");
		for (int i = 0; i < memberList2.size(); i++) {
			System.out.println(memberList2.get(i));
		}
		ois2.close();
		
	}
}
