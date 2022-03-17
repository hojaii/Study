
public class CallTest {
	public void method1() {
		method2();
		System.out.println("1");
	}
	public void method2() {
		method3();
		System.out.println("2");
	}
	public void method3() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		CallTest test = new CallTest();
		test.method1();
	}

	}

}
