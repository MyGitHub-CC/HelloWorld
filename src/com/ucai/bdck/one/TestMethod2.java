package com.ucai.bdck.one;
/**
 *方法的返回值和返回值类型。
 *返回值类型要和返回值一致。
 */
public class TestMethod2 {
	public static void main(String[] args) {
		int result = sum1(5,3);
		sum2 (5);
		System.out.println(result);
	}
	//完成任意两个整数相加的功能，得到结果值。
	//void：空的，是返回值类型。
	public static int sum1(int m, int n) {
		int sum = m + n;
		return sum; //返回sum1
	}

	public static void sum2(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("niaho");
		}
		return;  // 一般用于方法的结束条件
	}
}
