import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		//ǥ���Է��� Ű���� �Է��Դϴ�.
		//�ڹٿ��� Ű�����Է� ��ü�� System.In(InputStream)
		System.out.print("�̸��� �Է��ϼ���>>");
		Scanner Input = new Scanner(System.in);
		String name = Input.next();
		System.out.println(name);
		System.out.print("1~100������ �������� �Է��ϼ���>>");
		int num = Input.nextInt();
		System.out.println(num);
		
	}

}
