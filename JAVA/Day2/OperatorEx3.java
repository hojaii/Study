
public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 3 , num2 =5 ;
		//비교연산자 : >, >=, <, <=, ==, !=, instanceof
		//비교연산자의 결과는 boolean
		boolean result = num2 == num1 ;//기본 데이터타입에서는 값을비교함
		System.out.println(result);
		result = num2 != num1 ;
		System.out.println(result);
		String s1 = new String("java"); //문자열은 reference type으로 s1은객체
		String s2 = new String("java"); //s2는 String클래스로부터 생성된 객체
		result = s1 == s2;
		System.out.println(result);
		result = s1.equals(s2); //문자열 내용비교
		System.out.println(result);
		

	}

}
