
public class StaticEx {
	int num=100;
	static int snum=100;
	
	public static void main(String [] args) {
		StaticEx ex = new StaticEx(); // 객체생성
		System.out.println(ex.num);
		ex.num /= 10;
		System.out.println(ex.num);
		System.out.println(ex.snum);
		StaticEx ex2 = new StaticEx();
		System.out.println(ex2.num);
		System.out.println(ex.snum);
		ex2.snum /= 5;
		System.out.println(ex2.num);
		System.out.println(ex.snum);
		ex = new StaticEx(); //객체생성;
		System.out.println(ex.num);
		System.out.println(ex.snum);
		ex.snum *=3;
		System.out.println(ex.snum);
		//System.out.println(staticEx.num);//컴파일오류
		//System.out.println(num);//컴파일오류
		System.out.println(StaticEx.snum);
		System.out.println(snum);
		
		
	}
}
