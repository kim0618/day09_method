package day09_method;

import java.util.Scanner;

public class Quiz01_6 {

	
	public void print() {
		Scanner input = new Scanner(System.in);
		int num,temp;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		up(num);
		rev(num,up(num));
	}
	
	public int up(int num) {
		int result =0;
		while(true) {
			int temp = num % 10;
			num = num / 10;
			result = (result+temp)*10;
			if(num==0) return result/10;
	}
	}
	
	public void rev(int num, int re) {
		System.out.println(num+" 거꾸로 => "+re);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
