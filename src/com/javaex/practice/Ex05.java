package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		double sum = 0;
		
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		num[3] = sc.nextInt();
		num[4] = sc.nextInt();
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("���� " + sum/5 + " �Դϴ�.");
		
		
		sc.close();
	}

}
