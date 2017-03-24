package com.ucai.bdck.array;
// util : 工具包：Arrays类提供了很多操作数组的工具方法。
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		//能存储10个int类型数据的数组的定义
		int[] numarr = new int[10];
		//定义一个随机的对象，来使用它的方法（需要导包）
		Random ran = new Random();
		for (int i = 0; i < numarr.length; i++) {
			//取值范围：[0-101)，前闭后开
			int num = ran.nextInt(101);
			numarr[i] = num;
		}
		System.out.println(Arrays.toString(numarr));
		/*System.out.print("[");
		for (int i = 0; i < numarr.length; i++) {
			if (i == numarr.length - 1) {
				System.out.print(numarr[i]);
			} else {
				System.out.print(numarr[i]+",");
			}
		}
		System.out.println("]");*/
	}
}
