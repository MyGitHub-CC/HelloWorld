package com.ucai.bdck.array;

public class Array {
	public static void main(String[] args) {
		//静态初始化
//		int[] arr = {45,56,67,78}; 
//		String[] strArr = {"张三","李四","王五","赵六"};
		//定义数组：长度表示数组能存多少个数据
		int[] scoreArr = new int[3];
		//动态初始化
		scoreArr[0] = 66;
		scoreArr[1] = 76;
		scoreArr[2] = 59;
		//输出全部成绩
		for(int i = 0;i<scoreArr.length;i++) {
			System.out.println(scoreArr[i]);
		}
		
		int[] arr1 = new int[12];
		String[] arr2 = new String[13];
		//默认初始化：int类型默认值为0；String类型默认值是null
		System.out.println(arr1[2]);
		System.out.println(arr2[2]);
	}

}
