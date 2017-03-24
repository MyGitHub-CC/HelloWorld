package com.ucai.bdck.one;

public class PersonId {
	public static void main(String[] args) {
		String pid = "342501199007052151";
		String str = pid.substring(16, 17);
		int i = Integer.parseInt(str);
		if (i % 2 == 0) {
			System.out.println("性别为女");
		} else {
			System.out.println("性别为男");
		}
	}
}
