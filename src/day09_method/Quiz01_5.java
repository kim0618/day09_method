package day09_method;

import java.util.Scanner;

public class Quiz01_5 {

	public void print() {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("�Է� : ");
		num = input.nextInt();
		value(num);
		abs(num,value(num));
	}
	
	public int value(int num) {
		if(num<0) {
			return -num;
		}else {
			return num;
		}
	}
	
	public void abs(int num,int re) {
		System.out.println(num+"�� ���밪�� "+re+" �Դϴ�.");
	}
	
	

	
	
	
	
	
	
	
	
	
}
