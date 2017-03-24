package com.ucai.bdck.obconn;

public class Person {
	String name;
	int age;
	Person child;	//本类Person的对象child，也可以作为本类的属性使用。

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Person child) {
		this.name = name;
		this.age = age;
		this.child = child;
	}
}
