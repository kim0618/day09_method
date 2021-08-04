package day09_method;

import java.util.Scanner;

public class Quiz01_4 {

	public void print() {
	Scanner input = new Scanner(System.in);
	int num1;
	System.out.print("수 입력 : ");
	num1 = input.nextInt();
	int result = primeCheck(num1);
	outPut(num1,result);
	
	}
	
	public int primeCheck(int n1) {
		int cnt=0;
		for(int i=1;i<=n1;i++) {
			if(n1 % i == 0 )cnt++;
		}
		return cnt;
	}
	public void outPut(int n1,int re) {
		if(re == 2)
			System.out.println(n1+"은 소수 입니다 ");
		else
			System.out.println(n1+"은 소수가 아닙니다");
	}
	
	
	
	
	
	
	
	
}
