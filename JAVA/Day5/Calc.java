
public class Calc {
	public void process(int n1, int n2, String op) { //산술연산 후 출력
		//if또는 switch문으로 연산자에 따른 연산 수행 출력
		switch(op) {
		case "+" : System.out.println(n1+ "+"+ +n2+"="+(n1+n2));break;
		case "-" : System.out.println(n1+ "-"+ +n2+"="+(n1+n2));break;
		case "*" : System.out.println(n1+ "*"+ +n2+"="+(n1+n2));break;
		case "/" : System.out.println(n1+ "/"+ +n2+"="+(n1+n2));break;
		case "%" : System.out.println(n1+ "+"+ +n2+"="+(n1+n2));break;
		default :
			System.out.println("연산이 지원되지 않습니다");
			
		}
	}
	public int returnprocess(int n1, int n2, String op) { //산술 연산 후 결과값 반환
		int result = 0;
		switch(op) {
		case "+" : result = (n1+n2); break;
		case "-" : result = (n1-n2); break;
		case "*" : result = (n1*n2); break;
		case "/" : result = (n1/2); break;
		case "%" : result = (n1%n2); break;
		default :
			result = -1;
		}
		return result;
	}
	public static void main(String[] args) {
		//process(3, 5, "*"); //static메서드가 아니므로 소유자없이 메서드 호출 불가능
		Calc c1 = new Calc(); //Calc 클래스의 객체를 생성
		c1.process(3,  5, "*");
		int r = c1.returnprocess(3,  5, "*");
		System.out.println(r);
		System.out.println(c1.returnprocess(4,  7, "+"));
	}
}
