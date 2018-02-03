package com.itwill.dao.guest;

import java.sql.Date;
import java.util.ArrayList;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception{
		GuestDao guestDao = new GuestDao();
		// insert
		guestDao.insertGuestData(new Guest(2, "이기정", new Date(2017, 11, 20), "dlrlwjd1127@naver.com", "http://", "방명록 사용법", "방명록처럼 사용하시면 됩니다"));
		// select
		ArrayList<Guest> guestList = guestDao.selectDataAll();
		for (int i = 0; i < guestList.size(); i++) {
			System.out.println(guestList.get(i));
		}
		
		Guest getGuest = guestDao.selectDataByGuestNo(1);
		System.out.println(getGuest);
		
		// update
		guestDao.updateGuestData(new Guest(2, "김성연", new Date(2017, 11, 20), "dlrlwjd1127@naver.com", "http://", "방명록 사용법", "방명록처럼 사용하시면 됩니다"));
		
		// delete
		guestDao.deleteDataByGuestNo(2);
	}

}
