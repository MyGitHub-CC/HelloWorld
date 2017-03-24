package com.ucai.bdck.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
		int num = 2;
		int sum = 0;
		int max = 0;
		String[] nameArr = new String[num];
		int[] scoreArr = new int[num];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生的姓名");
			nameArr[i] = scan.next();
			System.out.println("请输入第" + (i + 1) + "个学生的成绩");
			scoreArr[i] = scan.nextInt();
			sum = sum + scoreArr[i];
			if (max < scoreArr[i]) {
				max = scoreArr[i];
			}

		}
		System.out.println(Arrays.toString(nameArr));
		System.out.println(Arrays.toString(scoreArr));
		System.out.println("平均成绩为：" + sum / num);
		System.out.println("最高分数为" + max);

		for (int i = 0; i < num; i++) {
			if (scoreArr[i] == max) {
				System.out.println("取得最高分的有：" + nameArr[i]);
			}
		}
		System.out.println("请输入要查找的学生姓名：");
		String name = scan.next();
		for ( int i = 0; i < num; i++) {
			if (nameArr[i].equals(name)) {
				System.out.println("您输入的学生分数为：" + scoreArr[i]);
				}
		}
	}
}
