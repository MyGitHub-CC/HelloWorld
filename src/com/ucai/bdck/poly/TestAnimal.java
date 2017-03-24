package com.ucai.bdck.poly;
/**
 *多态：一个表现，两条定理。
 *表现：父类的引用指向子类的对象
 *两条定理：
 *1、当发生多态（父类的引用指向子类的对象）时，不能调用子类的方法。
 *2、当发生多态时，如果调用的方法子类进行了重写，则会调用子类重写之后的方法。
 */
public class TestAnimal {
	public static void main(String[] args) {
		/*Dog dog = new Dog();
		dog.eat();*/
		//编译器认为  运行前认为
		//主观认为  客观存在
		Animal d = new Dog();
		//d.eat();
		if(d instanceof Dog) {	//判断左边的引用是否是右边的类型
			Dog d2 = (Dog) d;
			d2.dogMethod();
		}
	}
}
