package diy;

public class DiyForThriangle {
public static void main(String[] args) {
	int W=9,H=9;
	for(int i=0;i<(H+1)/2;i++){
		for(int j=0;j<W/2-i;j++){
			System.out.print(" ");
		}
		for(int k=1;k<(i+1)*2;k++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
