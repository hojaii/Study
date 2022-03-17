
public class CallByReference {
	public void change(int[] a, int[] b) {
		int temp = a[0];
		a[0]= b[0];
		b[0]= temp;
	}

	public static void main(String[] args) {
		int[] x= {3}, y= {5};
		CallByReference ex = new CallByReference();
		ex.change(x, y); //주소값이 전달
		System.out.println("x[0]="+x[0]+",y[0]="+y[0]);
	}

}
