package day09_method;

import java.util.Scanner;

public class Quiz01_3 {

	
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("입력 : ");
		num = input.nextInt();
		dr(num);
		pr(num,dr(num));
	}
	
	public int dr(int num) {
		if(num%3 ==0) {
		//	System.out.println(num+" <-3의 배수 입니다.");
			return 0;
		}else {
		//	System.out.println(num+" <-3의 배수가 아닙니다.");
			return 1;
		}
	}
	
	public void pr(int num,int re) {
		if(re ==0) {
			System.out.println(num+" <-3의 배수 입니다.");
		}else {
			System.out.println(num+" <-3의 배수가 아닙니다.");
		}
	}
	
	
	

	
	
	
	
}
