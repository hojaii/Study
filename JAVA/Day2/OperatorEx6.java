
public class OperatorEx6 {

	public static void main(String[] args) {
		int num1 =3, num2 =5, num3 =256 ;
		//shift 연산자 : << (left), >> (right), >>> (unsigned right)
		//비트를 이동시킴, 결과는 정수 반환
		int result = num1 << num2; //왼쪽으로 bit를 이동시키고 오른쪽 비트는 0으로 채움
		//num1* 2^num2과 결과가 동일
		System.out.println(result);
		result = num3 >> num1; //오른쪽으로 bit를 이동시키고 왼쪽 bit는 sign비트로 채움
		//num3 / 2^num1와 결과가 동일
		System.out.println(result);
		result = -num3 >> num1; 
		System.out.println(result); //양수는 양수결과 음수는 음수결과
		result = num3 >>> num1; //오른쪽으로 bit를 이동시키고 왼쪽 bit는 무조건 0으로 채움
		System.out.println(result);//결과는 무조건 양수
		result = -num3 >>> num1; 
		System.out.println(result);
		
		
		
		
}
}