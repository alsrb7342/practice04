package com.javaex.practice;

public class Ex02 {
	
	public static void main(String[] args) {
		
		double[] sum = new double[3];
		
		sum[0] = 1.2;
		sum[1] = 3.3;
		sum[2] = 6.7;
		
		for(int i=sum.length-1; i>=0; i--) {
			System.out.println(sum[i]);
		}
	}
	
	
}
