import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		int com = (int) (Math.random() * 100 + 1);
		int count = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("1���� 100������ ���� �Է����ּ���");
		int num1 = input.nextInt();if (num1 > com) {
			System.out.println("DOWN");
		} else if (num1 < com) {
			System.out.println("UP");
		} else
			System.out.println("�¸�!");
		int num2 = input.nextInt();if(num2>com)
		{
			System.out.println("DOWN");
		}else if(num2<com)
		{
			System.out.println("UP");
		}else System.out.println("�¸�!");
		int num3 = input.nextInt();if (num3 > com) {
			System.out.println("DOWN");
		} else if (num3 < com) {
			System.out.println("UP");
		} else
			System.out.println("�¸�!");
		int num4 = input.nextInt();if(num4>com)
		{
			System.out.println("DOWN");
		}else if(num4<com)
		{
			System.out.println("UP");
		}else System.out.println("�¸�!");
		int num5 = input.nextInt();if (num5==com)
		{
			System.out.println("�¸�!");
		}else {
			System.out.println("�й�!");
		}
	}
}


