package com.ucai.bdck.one;
/**
 * 实体类Person：用于描述整个人类的共同特征
 * 一个类由两个部分组成：人类的静态特征（属性），人类的动态行为（方法）
 * 
 * 先定义类：再由类来创建对象（一个一个具体的人）
 *一般方法也是属于具体某个对象的。
 *
 *构造方法：
 *1、如果一个类中没有写任何构造方法，则默认有无参的构造方法。
 *2.如果提供了具体构造方法，则默认的无参构造不再提供。
 *构造方法是一种特殊的方法
 *1、写法上：名称和类名必须一致，没有返回值类型。
 *2、作用上：用于创建对象
 *
 *重载：
 *1、方法名相同，方法参数不同，称为方法的重载。
 *2、方法参数不同：参数个数不同、类型不同、顺序不同
 *构造方法名与类名必须一致
 *
 *构造方法的相互调用问题：要避免死循环
 *this:表示本类对象(this表示来调用的那个对象)
 *1、this(参数)表示对本类其他构造方法的调用
 *2、this.来调用本类的属性或一般方法(属性和方法属于一个级别)
 */
public class Person {
	String name;
	int age;
	
	public Person() {
		this("张三",23);
	}
	public Person(String n ) {
		name = n;
	}
	//当方法中的形式参数或局部变量和属性同名时，直接使用的是形式参数或局部变量。（类似就近原则）
	public Person(String name ,int age) {
		this.name= name;
		this.age = age;
	}
	
	public void speak() {
		System.out.println("会说话");
	}
	public void walk() {
		System.out.println("会走路");
	}
	public void desc() {
		System.out.println("我叫"+name+",今年"+age+"岁");
	}
}
