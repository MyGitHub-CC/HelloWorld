package com.ucai.bdck.encap;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(200);

		System.out.println("p.getAge()");

		Person p2 = new Person("张三", -20);
		p2.desc();
	}
}
