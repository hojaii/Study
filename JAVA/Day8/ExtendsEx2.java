class Parent2{
	public void method() {
		System.out.println("Parent's method() called");
	}
	public void read() {
		//child¿« method2() »£√‚
		Child2 child = new Child2();
		child.method2();
	}
}
class Child2 extends Parent2 {
	public void method() {
		System.out.println("Child method() called");
	}
	public void method2() {
		method();
		super.method();
	}
}
public class ExtendsEx2 {
	public static void main(String[] args) {
		Child2 child = new Child2();
		//child.method();
		child.method2();
		Parent2 parent = new Parent2();
		parent.read();

	}

}
