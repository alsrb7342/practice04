package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		
		int[] wonArray = {50000,10000,5000,1000,500,100,50,10,5,1};
		
		System.out.println("금액: ");
		int won = sc.nextInt();
		
		for(int i=0; i<wonArray.length; i++) {
			if(won / wonArray[i] > 0) {
				System.out.println(wonArray[i] + "원:" + won/wonArray[i] + "개");
				won %= wonArray[i];
			}
		}
		
		sc.close();
	}

}
