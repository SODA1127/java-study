package com.itwill.dao.user;

import java.util.ArrayList;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserDao userDao = new UserDao();
		// insert
		userDao.insertUserData(new User("test", "test", "test", "test@gmail.com"));
		
		// select
		ArrayList<User> userList = userDao.selectDataAll();
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i));
		}
		
		User getUser = userDao.selectDataByUserID("guard");
		System.out.println(getUser);
		
		// update
		userDao.updateUserData(new User("test", "1234", "김성연", "ksy@naver.com"));
		
		// delete
		userDao.deleteDataByUserId("test");
	}

}
