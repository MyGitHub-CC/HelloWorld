package diy;

public class DiyMultiply {
	public static void main(String[] args) {
		int p=0;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				p=i*j;
				System.out.print(i+"*"+j+"="+p+" ");
			}
			if(p<10){
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
