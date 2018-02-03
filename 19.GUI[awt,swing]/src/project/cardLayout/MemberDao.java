package project.cardLayout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Data Access Object
 *  - ����鵥��Ÿ�� �����ϰ��ִ� ����(���̺�,members.ser)�� 
 *      Create,Read,Update,Delete  �۾��� �Ҽ��ִ� �����޽�带
 *      �������ִ� Ŭ����
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
      System.out.println("2.MemberDao.createMember("+addMember.getId()+")-->file ������");
      
      ArrayList<Member> memberList=this.fileRead();
      boolean isDuplicate = false;
      for (int i = 0; i < memberList.size(); i++) {
         Member tempMember = memberList.get(i);
         if (tempMember.getId().equals(addMember.getId())) {
            // id�ߺ�
            isDuplicate = true;
            break;
         }
      }
      if (!isDuplicate) {
         memberList.add(addMember);
         System.out.println(">> " + addMember.getId() + " �� �߰���");

      } else {
         System.out.println(">> " + addMember.getId() + " �� �ߺ����̵� �߰��ȵ�");
      }
      this.fileSave(memberList);
      
      
   }

   /*
    * read ������(select)
    */
   public ArrayList<Member> readMemberList() throws Exception {
      ArrayList<Member> memberList=this.fileRead();
      return memberList;
      
   }

   /*
    * read �Ѱ�(select)
    */
   public Member readMemberById(String id) throws Exception{
      System.out.println("\t\t2.MemberDao.readMemberById("+id+")--> �����б�");
      ArrayList<Member> memberList=this.fileRead();
      Member findMember=null;
      for (int i = 0; i < memberList.size(); i++) {
         Member tempMember = memberList.get(i);
         if(tempMember.getId().equals(id)) {
            findMember=tempMember;
            break;
         }
      }
      System.out.println("\t\t2.���Ϸκ��� "+ id+" ���ش��ϴ� Member��ü����ȯ:"+findMember);
      return findMember;
   }

   /*
    * update �Ѱ�
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
    * delete �Ѱ�
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