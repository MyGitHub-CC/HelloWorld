package com.ucai.bdck.sms;

import java.util.Scanner;

public class TestStaff {
	public static void main(String[] args) {
		Emp sta = new Emp();
		System.out.println("请输入被开除的员工");
		Scanner scanner = new Scanner(System.in);
		String scan = scanner.next();
		if (scan.equals(sta.getName())) {
			
		} else {
			System.out.println("未找到该员工");
		}
		
	}
}
