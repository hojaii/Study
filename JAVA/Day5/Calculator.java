//public plus a:int,b:int : int∑Œ ∏Æ≈œ
//public minus
// public multiply
// publuc divide
public class Calculator {
	public int plus(int a, int b) {
		return a+b;
	}
	public int minus(int a, int b) {
		return a-b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator ();
		System.out.println(calc.plus(10, 10));
		System.out.println(calc.minus(10, 10));
		System.out.println(calc.multiply(10, 10));
		System.out.println(calc.divide(10, 10));
	}
}
