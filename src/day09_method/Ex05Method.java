package day09_method;

public class Ex05Method {
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public void test(int n) {
		if(n== 1) {
			System.out.println("if");
		}else {
			System.out.println("else");
			return ;
		}
		System.out.println("test 메소드 종료;");
	}
	
	public String test02() {
		return "안녕하세요";
	}
	
	
	
}
