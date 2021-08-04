package day09_method;

import java.util.Scanner;

	public class Quiz01 {
		
		public void print() {
			Scanner input = new Scanner(System.in);
			int num;
			System.out.println("¼ö ÀÔ·Â : ");
			num = input.nextInt();
			String s = op(num);
			sys(s);
		}
		public String op(int num) {
			if(num%2 == 0) {
			//	System.out.println("Â¦¼ö");
				return "Â¦¼ö";
			}else {
			//	System.out.println("È¦¼ö");
				return "È¦¼ö";
			}
		}
		public void sys(String result) {
			System.out.println(result);
		}
		
		
		
		
		
		
		
		
}
