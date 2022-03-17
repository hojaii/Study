
public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3 , num2 =5;
		int result = -num1; //sign연산자
		System.out.println(result);
		result = ~num1; //1의보수 
		System.out.println(result);
		num1 = 7;
		result = ~num1; //1의보수
		System.out.println(result);
		
		//증감연산자는 선위, 후위 연산자로 사용가능
		result = ++num1 + ++num2 ;
		result = num1++ + num1++;
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(!num2);
		//!부정 연산자 true는 false로, false는 true로 변환하므로 boolean타입과 조건표현식에서만 사용가능
		boolean flag = false;
				System.out.println(!flag);
		flag = 3>4 ; //비교연산 결과
		System.out.println(flag);
		flag = !(3>4) ; //조건표현식, !연산수행
		System.out.println(flag);
		
		
		
	}

}
