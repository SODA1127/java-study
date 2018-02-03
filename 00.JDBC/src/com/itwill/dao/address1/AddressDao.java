package com.itwill.dao.address1;

import java.util.ArrayList;

public interface AddressDao {

	//insert
	int insert(Address address) throws Exception;

	//update
	void update(Address address) throws Exception;

	//select PK
	Address selectByNo(int findNo) throws Exception;
	
	//select
	ArrayList<Address> selectAll() throws Exception;

	//delete
	void deleteByNo(int no) throws Exception;

}