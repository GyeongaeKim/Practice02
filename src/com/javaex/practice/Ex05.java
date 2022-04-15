package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		int height = sc.nextInt();
		System.out.print("몸무게: ");
		int weight = sc.nextInt();
				
		double normal = (height-100)*0.9;
		
		if(weight>normal) {
			System.out.println("과체중 입니다.");
		}else if(weight==normal) {
			System.out.println("표준 입니다.");
		}else {
			System.out.println("저체중 입니다.");
		}
		
		System.out.println("표준체중: "+normal);
		
		
		sc.close();
		
	}
	

}
