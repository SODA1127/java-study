package project.cardLayout;
/*
 * - ��������� ���� ����Ͻ�(����) ����� �����ϴ°�ü
 * - UI���� �̰�ü�� Ư������� ����ؼ� �����������Ѵ�.  
 * - ����Ͻ�(����)�޽�� ����� DataAccess�� �ʿ��Ѱ�쿡
 *    MemberDao �� �����޽��(CRUD)�� ����ؼ� ����ó��
 * - MemberDao��ü�� ��������� ������.
 *     
 */

import java.util.ArrayList;

public class MemberManager {
   
   private MemberDao memberDao;
   
   public MemberManager() throws Exception{
      this.memberDao=new MemberDao();
   }
   
   /*
    * 1.ȸ������
    */
   public boolean joinMember(Member joinMember) throws Exception {
      System.out.println("1.MemberManager.joinMember("+joinMember.getId()+
            ")-->MemberDao.createMember("+joinMember.getId()+")ȣ��");
      
      boolean isSuccess=false;
      Member findMember=memberDao.readMemberById(joinMember.getId());
      /*
       * A.���̵��ߺ�üũ
       * 
       * B-1. ���̵��ߺ��̸� false return
       * B-2. ���̵��ߺ��ƴϸ� ȸ�������� true return
       * 
       */
      if(findMember==null) {
         memberDao.createMember(joinMember);
         isSuccess=true;
      }else {
         isSuccess=false;
      }
      return isSuccess;
   }
   /*
    * 2.�α���
    */
   public int login(String id,String pass) throws Exception{
      int loginState = 0;//0: ȸ���ƴ�, 1.�о����� ����ġ, 2.����
      Member findMember = memberDao.readMemberById(id);
      if(findMember!=null) {
         /*
          * ���Ե�ȸ��
          */
         if(findMember.getPassword().equals(pass)) {
            /*
             * ��й�ȣ��ġ
             */
            loginState=2;
         }else {
            /*
             * ��й�ȣ����ġ
             */
            loginState=1;
         }
         
      }else {
         loginState=0;
      }
      return loginState;
      
   }
   
   /*
    * 3.ȸ�� ���̵�(�ߺ��Ұ�)�� 1������(Ż��)
    */
   public void deleteMember(String id) throws Exception{
      memberDao.deleteMember(id);
   }
   
   
   /*
    * 4.ȸ������
    */
   public void updateMember(Member updateMember) throws Exception{
	   memberDao.updateMember(updateMember);
		
	}
   
   
   /*
    * 5.ȸ���Ѹ�˻�
    * 
    */
   public Member findById(String idStr) throws Exception{
      System.out.println("\t1.MemberManager.findById("+idStr+") --> memberDao.readMemberById("+idStr+") ȣ��");
      Member findMember=memberDao.readMemberById(idStr);
      System.out.println("\t1.MemberManager.findById()���� ��ȯ:"+findMember);
      
      return findMember;
      
   }

   
   
   /*
    * 6.ȸ����ü����Ʈ
    * 
    */
   public ArrayList<Member> memberList() throws Exception {
      return memberDao.readMemberList();
   }
   
   
   
}