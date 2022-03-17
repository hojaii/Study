class Parent3{
	public void method() {
		System.out.println("Parent's method() called");
	}

}
class Child3 extends Parent3 {
	public void method(int a, int b) { //override(재정의)메서드
		System.out.println("Child method() called");
		
	}
	public void method(int a) { //overload메서드
		System.out.println("Child method() called");
	}
	public void method() {//overload메서드
		System.out.println("Child method() called");
	}
}
public class ExtendsEx3 {
	public static void main (String[] args) {
		Child3 child = new Child3();
	}
}