package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("목: "+num1/num2);			
			System.out.println("나머지: "+num1%num2);		
		}else if(num1<num2) {
			System.out.println("목: "+num2/num1);			
			System.out.println("나머지: "+num2%num1);		
		}else {
			System.out.println("목: "+num1/num2);			
			System.out.println("나머지: "+num1%num2);
		}
		
		
		
		
		sc.close();
		
		
	}

}
