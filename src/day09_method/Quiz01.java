package day09_method;

import java.util.Scanner;

	public class Quiz01 {
		
		public void print() {
			Scanner input = new Scanner(System.in);
			int num;
			System.out.println("�� �Է� : ");
			num = input.nextInt();
			String s = op(num);
			sys(s);
		}
		public String op(int num) {
			if(num%2 == 0) {
			//	System.out.println("¦��");
				return "¦��";
			}else {
			//	System.out.println("Ȧ��");
				return "Ȧ��";
			}
		}
		public void sys(String result) {
			System.out.println(result);
		}
		
		
		
		
		
		
		
		
}
