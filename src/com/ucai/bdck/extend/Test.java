package com.ucai.bdck.extend;


public class Test {
	public static void main(String[] args) {
	/*	Student stu = new Student();
		stu.setName("张三");
		stu.setAge(20);
		stu.desc();*/
		
		Student stu = new Student("张三" , 20 , "1001");
		stu.desc();
	}
}
