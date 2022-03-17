
public class OperatorEx4 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 5, num3= 7 ;
		//논리 연산자 : 조건식&조건식 , 조건식 || 조건식
		//논리 연산자의 결과는 boolean
		//&&는 조건식 1과 조건식2가 true일때만 true반환
		//&&는 조건식 1과 조건식2중 하나라도 true이면 true반환, 조건식1과 조건식2가 false일때만 false반환
		
		boolean result = num2 > num1 && num3 ==num1 ; //true && false
		System.out.println(result);
		result = num2 > num1 || num3 == num1; //true || false
		System.out.println(result);
		result = num2 < num1 || num3 == num1; //false || false
		System.out.println(result);
		조건식1 && 조건식2 에서 조건식 1이 false이면 조건식2는수행 없이 false를 반환 : short circult연산자
		
		

	}

}
