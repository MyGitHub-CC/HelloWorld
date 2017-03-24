package diy;

public class Loop {
	public static void main(String[] args) {
		for (int i = 0;; i++) {
			System.out.println(i);
			if (i > 15) {
				System.out.println(123);
				System.out.println(456);
				System.out.println(123);
				System.out.println(456);
				break;
			}
		}
	}
}
