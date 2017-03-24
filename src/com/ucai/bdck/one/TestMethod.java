package com.ucai.bdck.one;
/**
 * 输出3遍Hello！
 * 输出5遍World！
 * 输出10遍Hello！
 * 输出5遍Hello！
 */
public class TestMethod {
	public static void main(String[] args) {
		String str1 = "Hello!";
		String str2 = "World!";
		a(3,str1 );	//实现了代码的复用
//		b(5,str2 );
		a(5,str2 );	
		a(10, str1);
//		b(5,str2);
		a(5, str2);
	}
	/**
	 * 方法的定义
	 */
	public static void a(int n, String str) {
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
	}

/*	public static void b(int n, String str) {
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
	}*/

}
