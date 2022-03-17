
public class StaticTest {
	int num; //non-static
	static int snum;	//static
	public void method() {	//non-static
		System.out.println("method(): "+num);
		System.out.println("method(): "+snum);
		//shareMethod();
	}
	public static void shareMethod() {	//static
		//System.out.println(num);
		System.out.println("shareMethod() :"+snum);
		StaticTest test = new StaticTest();
		test.method();
	}

	public static void main(String[] args) {
		shareMethod();
		StaticTest.shareMethod();
		StaticTest test = new StaticTest();
		test.method();

	}

}
