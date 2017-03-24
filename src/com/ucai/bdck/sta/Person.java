package com.ucai.bdck.sta;

/**
 *static：静态的、类的（所有对象共享的）
 *可以修饰属性、方法、内部类、语句块
 */
public class Person {
	private int age;
	static int a;

	public Person() {
		age++;
		a++;
	}
	
	public static void m1() {
		
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.age);
//		Person p2 = new Person();
//		System.out.println(p2.age);
//		Person p3 = new Person();
//		System.out.println(p3.age);
		System.out.println(Person.a);
		System.out.println(Person.a);
		System.out.println(Person.a);
		
//		Person p4 = null;
		//如果一个对象为null，当使用该对象调用一般属性或一般方法时，会报NullPointException
		Person.m1();
	}

}
