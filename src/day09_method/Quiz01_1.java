package day09_method;

import java.util.Scanner;

public class Quiz01_1 {

	
	public void print() {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.println("�� �� �Է� : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		op(n1,n2);
		ss(op(n1,n2));
	}
	
	public int op(int n1,int n2) {
		if(n1>n2) {
		//	System.out.println(n1+"�� "+n2+"�� "+n1+"�� �� ũ��");
			return n1;
		}else {
		//	System.out.println(n2+"�� "+n1+"�� "+n2+"�� �� ũ��");
			return n2;
		}
	}
	
	public void ss(int a) {
		System.out.println(a);
	}
	
	/*
	Scanner input = new Scanner(System.in);
	int n1,n2;
	System.out.println("�� �� �Է� : ");
	n1 = input.nextInt();
	n2 = input.nextInt();
	if(n1>n2) {
		System.out.println(n1+"�� "+n2+"�� "+n1+"�� �� ũ��");
	}else if(n1<n2) {
		System.out.println(n2+"�� "+n1+"�� "+n2+"�� �� ũ��");
	}
	*/
	
	
	
}
