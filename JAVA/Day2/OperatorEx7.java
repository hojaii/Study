
public class OperatorEx7 {

	public static void main(String[] args) {
		int num1 =3, num2 =5;
		//상황연산자 : 조건항 ? true일때 표현식 : false일때 표현식
		double result = (num1>= num2)? 99.9 : 90 ;
		//하나의 연산식에서 가장 큰 타입으로 boolean을 제외한 나머지 타입은 자동으로 승급됨
		int result2 = (int) ((num1 >= num2)? 99.9 : 90);
		System.out.println(result);
		System.out.println(result2);
		

	}

}
