package com.ucai.bdck.one;

public class MultiplyTable {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+i*j+" ");
			if(i*j<10){
				System.out.print(" ");
			}	
			}
			System.out.println();
			
		}
	}
}
