package com.ucai.bdck.one;

import java.util.Random;
import java.util.Scanner;

public class TestOrc {
	public static void main(String[] args) {
		// 创建一个怪物("食人怪"，500,5);
		/*
		 * Orc orc = new Orc("食人怪",500,5); orc.desc();
		 */
		// 定义Orc数组
		System.out.println("你已进入食人怪腹地");
		Random ran = new Random();
		Orc[] orcArr = new Orc[10];
		String[] nameArr = { "食人怪", "巫妖王", "半兽人" };
		// 完成数据初始化
		for (int i = 0; i < orcArr.length; i++) {
			int niLv = ran.nextInt(5) + 1;
			int niIndex = ran.nextInt(3);
			orcArr[i] = new Orc(nameArr[niIndex], niLv * 100, niLv);
		}
		System.out.println("数据初始化完成");
		for (int i = 0; i < orcArr.length; i++) {
			orcArr[i].desc();
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入1释放\"血战八方\"!");
		int n = scan.nextInt();
		if (n == 1) {
			System.out.println("释放\"血战八方\"!");
			for (int i = 0; i < orcArr.length; i++) {
				if (orcArr[i].hp <= 300) {
					orcArr[i].desc();
					System.out.println(orcArr[i].name + "被秒杀了！");
				} else {
					orcArr[i].desc();
					orcArr[i].hp -= 300;
					orcArr[i].desc();
				}
			}
		}
	}

}
