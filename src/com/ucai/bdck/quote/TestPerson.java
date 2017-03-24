package com.ucai.bdck.quote;

public class TestPerson {
	public static void main(String[] args) {
		// 引用存在于栈中 ；对象存在于堆中。 p是引用，不是对象。
		Person p = new Person("张三", 20);

		Person p2 = p;

		// new：用于开辟堆内存空间，创建对象
		p2 = new Person("李四", 33);

		System.out.println(p.name);
		System.out.println(p2.name);
	}
}
