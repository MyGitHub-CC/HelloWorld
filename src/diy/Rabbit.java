package diy;

public class Rabbit {
	public static void main(String[] args) {
		System.out.println("��1���µ���������Ϊ��1");
		System.out.println("��2���µ���������Ϊ��1");
		int p = 1, T = 12, s1 = 1, s2 = 1;
		for (int i = 3; i <=T; i++) {
			p= s2;
			s2= s1+ s2;
			s1 = p;
			System.out.println("��" + T + "���µ���������Ϊ��" + s2);
		}
		
	}
}
