package com.ucai.bdck.extend;
/**
 *面向对象三大特征：
 *[抽象] 、封装 、继承 、多态
 *封装是一种安全规范
 *继承：是为了代码的复用性
 *
 *继承：
 *1、使用extends关键字
 *2、当A继承自B时，A称为子类、派生类（subclass），而B称为父类、超类、基类（supclass）
 *3、什么时候能建立父子关系？ 里氏代换原则：A is a B
 *4、java中的继承是单根继承，即一个子类只能有一个父类，一个父类可以有多个子类
 *5、如果一个类没有继承自任何类，则它默认继承自Object
 *
 *有哪些内容被继承了？
 *1、一般方法被继承
 *2、构造方法(有参构造，无参构造)不能被继承
 *
 *如果子类的构造方法中的第一行，没有调用本类的其他构造方法，
 *也没有调用父类的构造方法，则默认有一个super();
 *
 *重写是多态的前提
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void desc() {
		System.out.println("我叫" + name + ",今年" + age + "岁");
	}
}
