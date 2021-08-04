package day09_method;

import java.util.Scanner;

public class Quiz01_1 {

	
	public void print() {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		System.out.println("두 수 입력 : ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		op(n1,n2);
		ss(op(n1,n2));
	}
	
	public int op(int n1,int n2) {
		if(n1>n2) {
		//	System.out.println(n1+"과 "+n2+"중 "+n1+"이 더 크다");
			return n1;
		}else {
		//	System.out.println(n2+"과 "+n1+"중 "+n2+"이 더 크다");
			return n2;
		}
	}
	
	public void ss(int a) {
		System.out.println(a);
	}
	
	/*
	Scanner input = new Scanner(System.in);
	int n1,n2;
	System.out.println("두 수 입력 : ");
	n1 = input.nextInt();
	n2 = input.nextInt();
	if(n1>n2) {
		System.out.println(n1+"과 "+n2+"중 "+n1+"이 더 크다");
	}else if(n1<n2) {
		System.out.println(n2+"과 "+n1+"중 "+n2+"이 더 크다");
	}
	*/
	
	
	
}
