package diy;

public class Narcissus {
public static void main(String[] args) {
	int r1=0,r2=0,r3=0,s=0;
	int i=100;
	for(;i<1000;i++){
		r1=i%100;
		r2=i/10%10;
		r3=i/100;
		if(s==r1*r1*r1+r2*r2*r2+r3*r3*r3){
		System.out.println(s);
		}
	}
}
}
