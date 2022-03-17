
public class OperatorEx5 {

	public static void main(String[] args) {
		int num1 =3, num2 =5, num3 =7 ;
		//비트 연산자 : 정수&정수, 정수|정수, 정수^정수
		//결과는 정수반환
		int result = num1 & num2 ; //두개의 bit값이 모두 1일때 1반환
		System.out.println(result);
		result = num1 | num2; //두개의 bit값이 하나라도 1일때 1반환
		System.out.println(result);
		result = num1 ^ num2; //두개의 bit값이 서로 다를때 1반환
		System.out.println(result);
		

	}

}
