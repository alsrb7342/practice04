package com.javaex.practice;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int y=0; y<i; y++) {
				if(lotto[i] == lotto[y]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		
		
	}
	
}
