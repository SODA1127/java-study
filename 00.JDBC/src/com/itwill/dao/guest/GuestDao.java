package com.itwill.dao.guest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.itwill.dao.common.ConnectionFactory;

/*
GUEST_NO	NUMBER(10,0)
GUEST_NAME	VARCHAR2(10 BYTE)
GUEST_DATE	DATE
GUEST_EMAIL	VARCHAR2(50 BYTE)
GUEST_HOMEPAGE	VARCHAR2(50 BYTE)
GUEST_TITLE	VARCHAR2(100 BYTE)
GUEST_CONTENT	VARCHAR2(4000 BYTE)
 */
public class GuestDao {
	private int guest_no;
	private String guest_name;
	private Date guest_date;
	private String guest_email;
	private String guest_homepage;
	private String guest_title;
	private String guest_content;
	
	public int insertGuestData(Guest guest) throws Exception{
		System.out.println("===========삽입시작===========");
		
		String insertSQL = "INSERT INTO GUEST VALUES(?, ?, ?, ?, ?, ?, ?)";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt =con.prepareStatement(insertSQL);
		pstmt.setInt(1, guest.getGuest_no());
		pstmt.setString(2, guest.getGuest_name());
		pstmt.setDate(3, guest.getGuest_date());
		pstmt.setString(4, guest.getGuest_email());
		pstmt.setString(5, guest.getGuest_homepage());
		pstmt.setString(6, guest.getGuest_title());
		pstmt.setString(7, guest.getGuest_content());
		int insertRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + insertRowCount);
		System.out.println("===========삽입완료===========");
		pstmt.close();
		return insertRowCount;
	}
	
	public void updateGuestData(Guest guest) throws Exception {
		System.out.println("===========업데이트 시작===========");
		String updateSQL = "UPDATE GUEST SET GUEST_NAME = ?, GUEST_DATE = ?, GUEST_EMAIL = ?, GUEST_HOMEPAGE = ?, GUEST_TITLE = ?, GUEST_CONTENT = ? WHERE GUEST_NO = ?";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setDate(2, guest.getGuest_date());
		pstmt.setString(3, guest.getGuest_email());
		pstmt.setString(4, guest.getGuest_homepage());
		pstmt.setString(5, guest.getGuest_title());
		pstmt.setString(6, guest.getGuest_content());
		pstmt.setInt(7, guest.getGuest_no());
		int updateRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + updateRowCount);	
		System.out.println("===========업데이트 완료===========");
		pstmt.close();
	}
	
	public Guest selectDataByGuestNo(int findGuestNo) throws Exception {
		System.out.println("===========" + findGuestNo +"번 게스트 정보 찾기===========");
		String selectAllSQL = "SELECT GUEST_NO, GUEST_NAME, GUEST_DATE, GUEST_EMAIL, GUEST_HOMEPAGE, GUEST_TITLE, GUEST_CONTENT FROM GUEST WHERE GUEST_NO = " + findGuestNo;
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSQL);
		ResultSet rs = pstmt.executeQuery();
		boolean isExist = rs.next();
		if(isExist) {
			guest_no = rs.getInt(1);
			guest_name = rs.getString(2);
			guest_date = rs.getDate(3);
			guest_email = rs.getString(4);
			guest_homepage = rs.getString(5);
			guest_title = rs.getString(6);
			guest_content = rs.getString(7);
			System.out.println("===========" + guest_no + "번 게스트 데이터 탐색 ===========");
		}else {
			System.out.println("no data!!");
		}
		
		Guest findGuest = new Guest(guest_no, guest_name, guest_date, guest_email, guest_homepage, guest_title, guest_content);
		pstmt.close();
		return findGuest;
	}
	
	public ArrayList<Guest> selectDataAll() throws Exception {
		ArrayList<Guest> guestList = new ArrayList<>();
		System.out.println("===========모두찾기===========");
		String selectSQL = "SELECT * FROM GUEST ORDER BY GUEST_NO";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			guest_no = rs.getInt(1);
			guest_name = rs.getString(2);
			guest_date = rs.getDate(3);
			guest_email = rs.getString(4);
			guest_homepage = rs.getString(5);
			guest_title = rs.getString(6);
			guest_content = rs.getString(7);
			Guest guest = new Guest(guest_no, guest_name, guest_date, guest_email, guest_homepage, guest_title, guest_content);
			guestList.add(guest);
		}
		System.out.println("===========셀렉팅 완료===========");
		pstmt.close();
		return guestList;
	}
	
	public void deleteDataByGuestNo(int guestNo) throws Exception{
		System.out.println("===========" + guestNo +"정보 삭제===========");
		String deleteSQL = "DELETE FROM GUEST WHERE GUEST_NO = '" + guestNo + "'";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		int deleteRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + deleteRowCount);		
		System.out.println("===========삭제완료===========");
		pstmt.close();
	}
	
}
