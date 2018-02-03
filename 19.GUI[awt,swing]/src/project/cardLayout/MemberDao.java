package project.cardLayout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Data Access Object
 *  - 멤버들데이타를 저장하고있는 파일(테이블,members.ser)에 
 *      Create,Read,Update,Delete  작업을 할수있는 단위메쏘드를
 *      가지고있는 클래스
 *   
 */
public class MemberDao {
   private File memberFile;
   public MemberDao() throws Exception {
      memberFile = new File("members.txt");
      if (!memberFile.exists()) {
         memberFile.createNewFile();
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(memberFile));
         oos.writeObject(new ArrayList<Member>());
      }
   }
   private ArrayList<Member> fileRead() throws Exception{
      ObjectInputStream ois = 
            new ObjectInputStream(new FileInputStream(memberFile));
      ArrayList<Member> memberList = 
            (ArrayList<Member>) ois.readObject();
      ois.close();
      return memberList;
   }
   private void fileSave(ArrayList<Member> memberList) throws Exception {
      ObjectOutputStream oos = 
            new ObjectOutputStream(new FileOutputStream(memberFile));
      oos.writeObject(memberList);
      oos.close();
   }
   /*
    * create(insert)
    */
   public void createMember(Member addMember) throws Exception {
      System.out.println("2.MemberDao.createMember("+addMember.getId()+")-->file 에저장");
      
      ArrayList<Member> memberList=this.fileRead();
      boolean isDuplicate = false;
      for (int i = 0; i < memberList.size(); i++) {
         Member tempMember = memberList.get(i);
         if (tempMember.getId().equals(addMember.getId())) {
            // id중복
            isDuplicate = true;
            break;
         }
      }
      if (!isDuplicate) {
         memberList.add(addMember);
         System.out.println(">> " + addMember.getId() + " 는 추가됨");

      } else {
         System.out.println(">> " + addMember.getId() + " 는 중복아이디 추가안됨");
      }
      this.fileSave(memberList);
      
      
   }

   /*
    * read 여러개(select)
    */
   public ArrayList<Member> readMemberList() throws Exception {
      ArrayList<Member> memberList=this.fileRead();
      return memberList;
      
   }

   /*
    * read 한개(select)
    */
   public Member readMemberById(String id) throws Exception{
      System.out.println("\t\t2.MemberDao.readMemberById("+id+")--> 파일읽기");
      ArrayList<Member> memberList=this.fileRead();
      Member findMember=null;
      for (int i = 0; i < memberList.size(); i++) {
         Member tempMember = memberList.get(i);
         if(tempMember.getId().equals(id)) {
            findMember=tempMember;
            break;
         }
      }
      System.out.println("\t\t2.파일로부터 "+ id+" 에해당하는 Member객체를반환:"+findMember);
      return findMember;
   }

   /*
    * update 한개
    */
   public void updateMember(Member updateMember) throws Exception {
      ArrayList<Member> memberList=this.fileRead();
      
      for (int i = 0; i < memberList.size(); i++) {
         Member tempMember=memberList.get(i);
         if(tempMember.getId().equals(updateMember.getId())) {
            tempMember.setName(updateMember.getName());
            tempMember.setPassword(updateMember.getPassword());
            tempMember.setAddress(updateMember.getAddress());
            tempMember.setMarried(updateMember.isMarried());
            break;
         }
      }
      
      this.fileSave(memberList);
   }

   /*
    * delete 한개
    */
   public void deleteMember(String id) throws Exception{
      ArrayList<Member> memberList=this.fileRead();
      
      for (int i = 0; i < memberList.size(); i++) {
         Member tempMember=memberList.get(i);
         if(tempMember.getId().equals(id)) {
            memberList.remove(i);
            //memberList.remove(tempMember);
            
            break;
         }
      }
      
      this.fileSave(memberList);
   }

}