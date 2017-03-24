package com.ucai.bdck.encap;
/**
 *alt + shift + s：生成getters setters 
 *
 *完全封装：
 *1、属性全部私有
 *2、提供统一的访问方式
 *3、提供无参和全参构造
 *4、实现序列化接口
 *
 *javabean
 */
public class Person2 {
	private String name;
	private int age;
	
	
	public Person2() {
		
	}

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
