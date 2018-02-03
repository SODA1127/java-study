package com.itwill.dao.address3;

import java.util.ArrayList;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		AddressDao addressDao = new AddressDao();
		
		//insert
		addressDao.insert(new Address(1, "bbb", "이기정", "777-7777", "인천 남동구"));
		
		//select
		ArrayList<Address> addressList = addressDao.selectAll();
		for (int i = 0; i < addressList.size(); i++) {
			System.out.println(addressList.get(i));
		}
		
		Address getAddress = addressDao.selectByNo(10);
		System.out.println(getAddress);
		
		//update
		addressDao.update(new Address(2, "aaa", "이효리", "888-8888", "제주 서귀포"));
		
		//delete
		addressDao.deleteByNo(1);

		
	}

}
