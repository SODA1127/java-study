package com.itwill.dao.address1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.itwill.dao.common.ConnectionFactory;

public class AddressDaoImpl implements AddressDao {
	//insert
	/* (non-Javadoc)
	 * @see com.itwill.dao.address.AddressDao#insert(com.itwill.dao.address.Address)
	 */
	@Override
	public int insert(Address address) throws Exception {
		System.out.println("===========삽입시작===========");
		int no = address.getNo();
		String id = address.getId();
		String name = address.getName();
		String phone = address.getPhone();
		String getAddress = address.getAddress();
		
		String insertSQL = "insert into address values(" + no + ",'" + id + "','" + name + "','" + phone + "','" + getAddress + "')";
		Connection con = ConnectionFactory.getConection();
		System.out.println("1. Connection : " + con);
		PreparedStatement pstmt =con.prepareStatement(insertSQL);
		
		System.out.println(pstmt);
		int insertRowCount = pstmt.executeUpdate(insertSQL);
		System.out.println("rowCount : " + insertRowCount);
		System.out.println("===========삽입완료===========");
		pstmt.close();
		return insertRowCount;
		
	}
	
	//update
	/* (non-Javadoc)
	 * @see com.itwill.dao.address.AddressDao#update(com.itwill.dao.address.Address)
	 */
	@Override
	public void update(Address address) throws Exception {
		System.out.println("===========업데이트 시작===========");
		int no = address.getNo();
		String id = address.getId();
		String name = address.getName();
		String phone = address.getPhone();
		String getAddress = address.getAddress();
		
		String updateSQL = "update address set id='"+ id +"',name='" + name +"',phone='" + phone + "',address='" + getAddress + "' where no = " + no;
		Connection con = ConnectionFactory.getConection();
		System.out.println("1. Connection : " + con);
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
		int updateRowCount = pstmt.executeUpdate(updateSQL);
		System.out.println("rowCount : " + updateRowCount);	
		System.out.println("===========업데이트 완료===========");
		pstmt.close();
	}
	
	//selectAll
	/* (non-Javadoc)
	 * @see com.itwill.dao.address.AddressDao#selectByNo(int)
	 */
	@Override
	public Address selectByNo(int findNo) throws Exception{
		int no = 0;
		String id = "";
		String name = "";
		String phone = "";
		String address = "";
		System.out.println("===========" + findNo +"번행 찾기===========");
		String selectSQL = "select no, id, name, phone, address from address where no = " + findNo; 
		Connection con = ConnectionFactory.getConection();
		System.out.println("1. Connection : " + con);
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
		
		ResultSet rs = pstmt.executeQuery(selectSQL);
		boolean isExist = rs.next();
		
		if(isExist) {
			no = rs.getInt("no");
			id = rs.getString("id");
			name = rs.getString("name");
			phone = rs.getString("phone");
			address = rs.getString("address");
			System.out.println("===========" + no + "번 데이터 탐색 ===========");
			//System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
		} else {
			System.out.println("no data!!");
		}
		
		Address getAddress = new Address(no, id, name, phone, address);
		
		pstmt.close();
		return getAddress;
	}
	
	/* (non-Javadoc)
	 * @see com.itwill.dao.address.AddressDao#selectAll()
	 */
	@Override
	public ArrayList<Address> selectAll() throws Exception {
		ArrayList<Address> addressList = new ArrayList<>();
		System.out.println("===========모두찾기===========");
		String selectSQL = "select no, id, name, phone, address from address order by no";
		Connection con = ConnectionFactory.getConection();
		System.out.println("1. Connection : " + con);
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(selectSQL);
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			//System.out.println(no + "\t" + id + "\t" + name + "\t" + phone + "\t" + address);
			Address getAddress = new Address(no, id, name, phone, address);
			addressList.add(getAddress);
		}
		System.out.println("===========셀렉팅 완료===========");
		stmt.close();
		return addressList;
	}
	
	/* (non-Javadoc)
	 * @see com.itwill.dao.address.AddressDao#deleteByNo(int)
	 */
	@Override
	public void deleteByNo(int no) throws Exception{
		System.out.println("===========" + no + "번호 행삭제===========");
		String deleteSQL = "delete from address where no = " + no;
		Connection con = ConnectionFactory.getConection();
		System.out.println("1. Connection : " + con);

		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		int deleteRowCount = pstmt.executeUpdate(deleteSQL);
		System.out.println("rowCount : " + deleteRowCount);		

		System.out.println("===========삭제완료===========");
		pstmt.close();
	}
	
}
