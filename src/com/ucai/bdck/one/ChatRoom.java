package com.ucai.bdck.one;

import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {
		System.out.println("欢迎进入模拟聊天室");
		for(;;) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入：");
			String mysay = scanner.next();
			System.out.println("我说："+mysay);
		}
		
	}
}

//			if (mysay.equals("计划")) {
//				System.out.println("***");
//				continue;
//			} else if (mysay.equals("bye")) {
//				System.out.println("我说：" + mysay);
//				break;
//			}else{
//			}