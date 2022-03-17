
public class Calc {
	public void plus(int a, int b) {
		System.out.println("plus(int, int) called");
		
	}
	public void plus(int a, int b, int c) { //overload method
		System.out.println("plus(int, int, int) called");
	}
	public double plus(double a, double b) {
		System.out.println("plus(double, double) called");
		return a+b;
	}
	String plus(String a, String b) {
		System.out.println("plus(String, String) called");
		return a+b;
	}
		
	public static void main(String[] args) {
		Calc cal = new Calc();
		int x=3;
		char y= 'A';
		cal.plus(x,y); //plus(int, int) called
		float z= 0.5f;
		cal.plus(x, z);
		cal.plus("java", "he");
		
	}

}
