package resultset;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.dao.common.ConnectionFactory;

public class ResultSetMain {
	/*
	 <<S_PRODUCT>>
		이름           널?       유형            
		---------- -------- ------------- 
		ID         NOT NULL NUMBER(7)     
		NAME                VARCHAR2(50)  
		SHORT_DESC          VARCHAR2(255) 
		PRICE               NUMBER(10,3)  
		IPGO_DATE           DATE          
	*/
	
	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getConection();
		PreparedStatement pstmt =
				con.prepareStatement("select id, name, short_desc, price, ipgo_date "
				+ "from s_product");
		ResultSet rs = pstmt.executeQuery();

		System.out.println("----------------------- rs.getString -----------------------");
		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			String price = rs.getString("price");
			String ipgo_date = rs.getString("ipgo_date");
			System.out.println(id + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		rs.close();
		System.out.println("----------------------- rs.getXXX(타입) -----------------------");
		rs = pstmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			String short_desc = rs.getString("short_desc");
			double price = rs.getDouble("price");
			Date ipgo_date = rs.getDate("ipgo_date");
			System.out.println(id + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		rs.close();
		
		System.out.println("----------------------- rs.getObejct -----------------------");
		rs = pstmt.executeQuery();
		while (rs.next()) {
			Object id = rs.getObject("id");
			Object name = rs.getObject("name");
			Object short_desc = rs.getObject("short_desc");
			Object price = rs.getObject("price");
			Object ipgo_date = rs.getObject("ipgo_date");
			System.out.println(id + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		rs.close();
		
		System.out.println("----------------------- rs.getXXX(컬럼 번호) -----------------------");
		rs = pstmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			String short_desc = rs.getString(3);
			double price = rs.getDouble(4);
			Date ipgo_date = rs.getDate(5);
			System.out.println(id + "\t" + name + "\t" + short_desc + "\t" + price + "\t" + ipgo_date);
		}
		rs.close();
		
		
		
	}

}
