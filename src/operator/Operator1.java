package operator;

public class Operator1 {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;

		//덧셈
		int sum = a+b;
		System.out.println("a + b = " + sum);

		//뺄셈
		int diff = a-b;
		System.out.println("a - b = " + diff);

		// 곱셈
		int multi = a*b;
		System.out.println("a * b = " + multi);

		//나눗셈
		int div = a / b;
		System.out.println("a / b = " + div);

		//나머지
		int mod = a % b;
		System.out.println("a % b = " + mod);

		/*
		* int는 정수여도 소수점이하는 포함 안함
		* 0으로 못나눔
		* */
	}

}
