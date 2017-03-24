package com.ucai.bdck.extend;
/**
 *Student继承Person
 */
public class Student extends Person{
	
	private String sno;
	
	public Student() {
		super();
	}

	public Student(String name , int age , String sno) {
		//1、使用super.调用父类的set方法
		//super:指父类对象
		/*super.setName(name);
		super.setAge(age);*/
		//2、使用super(参数)调用父类的方法
//		super(name , age);
		//3、使用本类继承父类的方法，this.来调用
		this.setName(name);
		this.setAge(age);
		
		this.sno = sno;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
	/**
	 * 重写/覆盖/覆写override
	 * 重写：
	 * 1、发生在父子类之间
	 * 2、同名同参同返回
	 */
	@Override
	public void desc() {
		System.out.println("我叫" + this.getName() + ",今年" + this.getAge() + "岁，学号"+this.sno);
	}
	

}
