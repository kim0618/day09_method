package day09_method;

import java.util.Scanner;

public class Quiz01_3 {

	
	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�Է� : ");
		num = input.nextInt();
		dr(num);
		pr(num,dr(num));
	}
	
	public int dr(int num) {
		if(num%3 ==0) {
		//	System.out.println(num+" <-3�� ��� �Դϴ�.");
			return 0;
		}else {
		//	System.out.println(num+" <-3�� ����� �ƴմϴ�.");
			return 1;
		}
	}
	
	public void pr(int num,int re) {
		if(re ==0) {
			System.out.println(num+" <-3�� ��� �Դϴ�.");
		}else {
			System.out.println(num+" <-3�� ����� �ƴմϴ�.");
		}
	}
	
	
	

	
	
	
	
}
