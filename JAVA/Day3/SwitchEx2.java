import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int num1 = Input.nextInt();
		System.out.print("���� ���ڸ� �Է����ּ���");
		int num2 = Input.nextInt();
		System.out.print("�����ڸ� �Է����ּ���");
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
			System.out.println("�ش� �����ڸ� �������� �����ϴ�");}
			if(flag) {
				System.out.println(num1 +"" +oper + num2 + "=" + result);}
			
			}
}