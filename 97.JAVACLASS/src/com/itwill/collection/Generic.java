package com.itwill.collection;

public class Generic <T, T1>{
	private T member;
	private T1 member1;
	
	public T getMember(){
		return member;
	}

	public void setMember(T member){
		this.member = member;
	}
	
	public T1 getMember1() {
		return member1;
	}
	
	
	public void setMember1(T1 member1){
		this.member1 = member1;
	}
}
