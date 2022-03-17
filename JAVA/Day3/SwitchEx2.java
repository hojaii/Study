import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num1 = Input.nextInt();
		System.out.print("다음 숫자를 입력해주세요");
		int num2 = Input.nextInt();
		System.out.print("연산자를 입력해주세요");
		char oper = Input.next().charAt(0);
		int result = 0;
		boolean flag = true;
		switch(oper) {
		case '+' : result = num1 + num2 ; break;
		case '-' : result = num1 - num2 ; break;
		case '*' : result = num1 * num2 ; break;
		case '/' : result = num1 / num2 ; break;
		default:
			flag = false;
			System.out.println("해당 연산자를 읽을수가 없습니다");}
			if(flag) {
				System.out.println(num1 +"" +oper + num2 + "=" + result);}
			
			}
}