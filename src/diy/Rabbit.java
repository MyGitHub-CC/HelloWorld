package diy;

public class Rabbit {
	public static void main(String[] args) {
		System.out.println("第1个月的兔子总数为：1");
		System.out.println("第2个月的兔子总数为：1");
		int p = 1, T = 12, s1 = 1, s2 = 1;
		for (int i = 3; i <=T; i++) {
			p= s2;
			s2= s1+ s2;
			s1 = p;
			System.out.println("第" + T + "个月的兔子总数为：" + s2);
		}
		
	}
}
