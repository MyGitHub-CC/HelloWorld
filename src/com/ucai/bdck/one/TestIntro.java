package com.ucai.bdck.one;

import java.util.Scanner;

public class TestIntro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = scanner.next();
		System.out.println("请输入您的年龄：");
		int age = scanner.nextInt();
		System.out.println("您的姓名是："+name+"，今年"+age+"岁。");
		

	}

}
