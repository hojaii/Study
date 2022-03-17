
public class CallByValue {
	public void change(int a, int b) {
		int temp = a;
		a= b;
		b= temp;
	}

	public static void main(String[] args) {
		int x=3, y=5;
		CallByValue ex = new CallByValue();
		ex.change(x, y);
		System.out.println("x="+x+",y="+y); //값이 복사
	}

}
