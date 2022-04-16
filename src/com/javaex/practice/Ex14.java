package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double profit = sc.nextDouble();
		
		/*
		세금계산법
		0<=profit<=1000; 
			tax1=0.09*profit;
		1000<profit<=4000; 
			tax2=(1000*0.09)+(0.18*(profit-1000));
		4000<profit<8000; 
			tax3=(1000*0.09)+(3000*0.18)+(0.27*(profit-4000));
		8000<=profit; 
			tax4=(1000*0.09)+(3000*0.18)+(4000*0.27)+(0.36*(profit-8000)); 
		*/
		
		if(0<=profit&&profit<=1000) {
			double tax1=0.09*profit;
			System.out.println("소득세는 "+tax1+" 입니다.");
		}else if(1000<profit&&profit<=4000) {
			double tax2=(1000*0.09)+(0.18*(profit-1000));
			System.out.println("소득세는 "+tax2+" 입니다.");
		}else if(4000<profit&&profit<8000) {
			double tax3=(1000*0.09)+(3000*0.18)+(0.27*(profit-4000));
			System.out.println("소득세는 "+tax3+" 입니다.");
		}else if(8000<=profit) {
			double tax4=(1000*0.09)+(3000*0.18)+(4000*0.27)+(0.36*(profit-8000));
			System.out.println("소득세는 "+tax4+" 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		sc.close();

	}

}
