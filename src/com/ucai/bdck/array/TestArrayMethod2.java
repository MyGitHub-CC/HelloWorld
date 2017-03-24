package com.ucai.bdck.array;

/**
 *对于Java来说：
 *数据类型：基本数据类型，引用数据类型
 *基本数据类型：int short long  boolean chat float double
 *引用数据类型：类、接口、数组、枚举等。 
 *
 *方法的重载：
 *多个方法同名不同参，称为方法的重载；
 *重载的好处：降低学习成本。
 */
public class TestArrayMethod2 {
	public static void main(String[] args) {
		int[] intArr = {12,23,56,55};
		ToString(intArr);
		System.out.println();//换行
		String[] strArr = {"zhangsan","李四","wang五"}; 
		ToString(strArr);
		System.out.println();//换行
		boolean[] boolArr = {true,false,true,false}; 
		ToString(boolArr);
		System.out.println();//换行
	}
	//编码规则：变量名、方法名：第一个单词的首字母小写，其他单词的首字母大写，其他字母小写。
	public static void ToString(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("]");
	}
	public static void ToString(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("]");
	}
	public static void ToString(boolean[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("]");
	}
}
