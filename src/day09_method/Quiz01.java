package day09_method;

import java.util.Scanner;

	public class Quiz01 {
		
		public void print() {
			Scanner input = new Scanner(System.in);
			int num;
			System.out.println("熱 殮溘 : ");
			num = input.nextInt();
			String s = op(num);
			sys(s);
		}
		public String op(int num) {
			if(num%2 == 0) {
			//	System.out.println("礎熱");
				return "礎熱";
			}else {
			//	System.out.println("�汝�");
				return "�汝�";
			}
		}
		public void sys(String result) {
			System.out.println(result);
		}
		
		
		
		
		
		
		
		
}
