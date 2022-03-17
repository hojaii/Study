
public class DefaultValueEx {
	boolean success;
	int num;
	char ch;
	double d;
	String s; // reference type(클래스, 배열, 인터페이스)
	
		public static void main (String[] args) {
			//main메서드의 소유자는 DefaultValueEx가 아니며
			//main메서드는 실행시에 JVM에 의해서 실행되는 특수한 메서드
			//static 메서드이므로 non-static객체이거나 필드, 메서드는 반드시 객체를 생성 후 사용
			DefaultValueEx ex=new DefaultValueEx(); //객체생성
			System.out.println(ex.success);
			System.out.println(ex.num);
			System.out.println(ex.ch);
			System.out.println(ex.d);
			System.out.println(ex.s);
		}
}
