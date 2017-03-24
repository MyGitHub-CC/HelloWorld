package com.ucai.bdck.encap;

/**
 * 封装： 
 * 1.属性私有化 
 * 2、提供统一的设置和取出的方案
 */
public class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public void desc() {
		System.out.println("我叫" + name + ",今年" + age + "岁");
	}
}
