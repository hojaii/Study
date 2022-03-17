import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		//두개의 정수와 하나의 산술연산자를 입력받아서
		//연산 결과를 출력
		//ex)첫번째 정수입력:3
		//두번째 정수입력 : 5
		//산술연산자 ( * / + - %) : +
		//출력예시 3+5=8
		//다른 연산자 입력시 연산 서비스 미지원
		Scanner Input = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num1 = Input.nextInt();
		System.out.print("다음 숫자를 입력해주세요");
		int num2 = Input.nextInt();
		System.out.print("연산자를 입력해주세요");
		char oper = Input.next().charAt(0);
		int result = 0;
		boolean flag = true;
		if (oper =='+') {
			result = num1 + num2 ;}
		else if (oper == '-') {
			result = num1 - num2 ;}
		else if (oper == '*') {
			result = num1 * num2 ;}
		else if (oper == '/') {
			result = num1 / num2 ;}
		else{
			System.out.println("해당 연산자를 읽을수가 없습니다") ;}
		if(flag) {
			System.out.println(num1 + ""+oper + num2 + "=" + result);}
		}
		
		
		
		}
		