package com.ucai.bdck.tostring;
/**
 *java中的比较
 *1、基本数据类型使用==进行比较
 *2、引用数据类型
 *		如果使用==，则表示比较的是内存中的地址。
 *		如果使用继承自Object的equals，作用和==一样。
 *		如果想进行逻辑上的比较，则需要重写Object的equals方法。
 */
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("张三" , 20);
		Person p2 = new Person("张三" , 20);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		//输出对象，即是输出其（toString()）字符串形式
//		System.out.println(p);
	}

}
