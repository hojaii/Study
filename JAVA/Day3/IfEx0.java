import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("1~100������ �������� �Է��ϼ���>>");
		int num = Input.nextInt();
		if (num>1 && num <= 100) {
		System.out.println(num);
		System.out.println("pass");
		}else {
				System.out.println("�� �̻� ������ �� �����Ƿ� ���α׷��� �����մϴ�");
		}
		
	}

}