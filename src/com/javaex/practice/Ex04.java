package com.javaex.practice;

public class Ex04 {
	
	public static void main(String[] args) {
		
		int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int sum = 0;
		int result = 0;
		
		
		for(int i=0; i<data.length; i++) {
			
			if(data[i]%3 == 0) {
				sum++;
				result += data[i];
				
				
			}
			
		}
		System.out.println("�־��� �迭���� 3�� ����� ����=>" + sum);
		System.out.println("�־��� �迭���� 3�� ����� ��=>" + result);
		
	}

}
