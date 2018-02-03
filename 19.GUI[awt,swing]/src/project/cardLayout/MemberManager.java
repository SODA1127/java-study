package project.cardLayout;
/*
 * - 멤버관리를 위한 비즈니스(업무) 기능을 제공하는객체
 * - UI에서 이객체의 특정기능을 사용해서 업무를수행한다.  
 * - 비즈니스(업무)메쏘드 실행시 DataAccess가 필요한경우에
 *    MemberDao 의 단위메쏘드(CRUD)를 사용해서 업무처리
 * - MemberDao객체를 멤버변수로 가진다.
 *     
 */

import java.util.ArrayList;

public class MemberManager {
   
   private MemberDao memberDao;
   
   public MemberManager() throws Exception{
      this.memberDao=new MemberDao();
   }
   
   /*
    * 1.회원가입
    */
   public boolean joinMember(Member joinMember) throws Exception {
      System.out.println("1.MemberManager.joinMember("+joinMember.getId()+
            ")-->MemberDao.createMember("+joinMember.getId()+")호출");
      
      boolean isSuccess=false;
      Member findMember=memberDao.readMemberById(joinMember.getId());
      /*
       * A.아이디중복체크
       * 
       * B-1. 아이디중복이면 false return
       * B-2. 아이디중복아니면 회원가입후 true return
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
    * 2.로그인
    */
   public int login(String id,String pass) throws Exception{
      int loginState = 0;//0: 회원아님, 1.패쓰워드 불일치, 2.성공
      Member findMember = memberDao.readMemberById(id);
      if(findMember!=null) {
         /*
          * 가입된회원
          */
         if(findMember.getPassword().equals(pass)) {
            /*
             * 비밀번호일치
             */
            loginState=2;
         }else {
            /*
             * 비밀번호불일치
             */
            loginState=1;
         }
         
      }else {
         loginState=0;
      }
      return loginState;
      
   }
   
   /*
    * 3.회원 아이디(중복불가)로 1개삭제(탈퇴)
    */
   public void deleteMember(String id) throws Exception{
      memberDao.deleteMember(id);
   }
   
   
   /*
    * 4.회원수정
    */
   public void updateMember(Member updateMember) throws Exception{
	   memberDao.updateMember(updateMember);
		
	}
   
   
   /*
    * 5.회원한명검색
    * 
    */
   public Member findById(String idStr) throws Exception{
      System.out.println("\t1.MemberManager.findById("+idStr+") --> memberDao.readMemberById("+idStr+") 호출");
      Member findMember=memberDao.readMemberById(idStr);
      System.out.println("\t1.MemberManager.findById()에서 반환:"+findMember);
      
      return findMember;
      
   }

   
   
   /*
    * 6.회원전체리스트
    * 
    */
   public ArrayList<Member> memberList() throws Exception {
      return memberDao.readMemberList();
   }
   
   
   
}