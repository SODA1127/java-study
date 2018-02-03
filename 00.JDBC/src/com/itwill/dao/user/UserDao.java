package com.itwill.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.itwill.dao.common.ConnectionFactory;

public class UserDao {
	private String userId;
	private String password;
	private String name;
	private String email;
	
	public int insertUserData(User user) throws Exception{
		System.out.println("===========삽입시작===========");
		
		String insertSQL = "INSERT INTO userinfo VALUES(?, ?, ?, ?)";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt =con.prepareStatement(insertSQL);
		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		int insertRowCount = pstmt.executeUpdate();
		
		
		System.out.println("rowCount : " + insertRowCount);
		System.out.println("===========삽입완료===========");
		pstmt.close();
		return insertRowCount;
	}
	
	public void updateUserData(User user) throws Exception {
		System.out.println("===========업데이트 시작===========");
		String updateSQL = "UPDATE USERINFO SET PASSWORD = ?, NAME = ?, EMAIL = ? WHERE USERID = ?";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getName());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getUserId());
		int updateRowCount = pstmt.executeUpdate();
		System.out.println("rowCount : " + updateRowCount);	
		System.out.println("===========업데이트 완료===========");
		pstmt.close();
	}
	
	public User selectDataByUserID(String findUserId) throws Exception {
		System.out.println("===========" + findUserId +"정보 찾기===========");
		String selectAllSQL = "SELECT USERID, PASSWORD, NAME, EMAIL FROM USERINFO WHERE USERID = '" + findUserId + "'";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(selectAllSQL);
		ResultSet rs = pstmt.executeQuery();
		boolean isExist = rs.next();
		if(isExist) {
			userId = rs.getString("USERID");
			password = rs.getString("PASSWORD");
			name = rs.getString("NAME");
			email = rs.getString("EMAIL");
			System.out.println("===========" + userId + " 데이터 탐색 ===========");
		}else {
			System.out.println("no data!!");
		}
		
		User getuser = new User(userId, password, name, email);
		pstmt.close();
		return getuser;
	}
	
	public ArrayList<User> selectDataAll() throws Exception {
		ArrayList<User> userList = new ArrayList<>();
		System.out.println("===========모두찾기===========");
		String selectSQL = "SELECT * FROM USERINFO ORDER BY USERID";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		ResultSet rs = pstmt.executeQuery(selectSQL);
		while (rs.next()) {
			userId = rs.getString("USERID");
			password = rs.getString("PASSWORD");
			name = rs.getString("NAME");
			email = rs.getString("EMAIL");
			User getuser = new User(userId, password, name, email);
			userList.add(getuser);
		}
		System.out.println("===========셀렉팅 완료===========");
		pstmt.close();
		return userList;
	}
	
	public void deleteDataByUserId(String findUserId) throws Exception{
		System.out.println("===========" + userId +"정보 삭제===========");
		String deleteSQL = "DELETE FROM USERINFO WHERE USERID = '" + findUserId + "'";
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		int deleteRowCount = pstmt.executeUpdate(deleteSQL);
		System.out.println("rowCount : " + deleteRowCount);		
		System.out.println("===========삭제완료===========");
		pstmt.close();
	}
	
}
