import java.util.Scanner;

//���� �޼��忡�� ������ ��ȭ�ϰ� ������ 1, ȭ���� ��ȭ�ϰ������ 2�� �Է¹ް�
//fahrenheitToCelsius�޼��带 ���ؼ� ȭ���� ������
//celsiusToFahrenheit�޼��带 ���ؼ� ������ �ٲ� ����ϴ� ���α׷��� ����ÿ�
//ȭ�� = 1.8*����+32, ���� = (ȭ�� - 32) /1.8
//��¿� 
// == �޴� ==
//1. ȭ���� ������ ��ȯ
//2.������ ȭ���� ��ȯ
//==
//�޴���ȣ : 1 >if��
//������ �Է��ϼ���:90 (int�� ĳ����)
//���÷� ��ȯ�� �µ��� 32.2
public class CalcQ {
	
	public void fahrenheitToCelsius(int a) {
	
	}
	public void celsiusToFahrenheit(int b) {
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalcQ convert = new CalcQ();
		System.out.println("=====�޴�=====");
		System.out.println("1.ȭ���� ������ ��ȯ");
		System.out.println("2.������ ȭ���� ��ȯ");
		System.out.println("=============");
		System.out.println("��ȯ�� ��ȣ�� �������ּ���");
		double menu = input.nextInt();
		if (menu == 1) {
			System.out.println("��ȯ�� ȭ���� �Է����ּ���");
			int a = input.nextInt();
			convert.fahrenheitToCelsius(a);
		}else if(menu == 2) {
			System.out.println("������ �Է����ּ���");
			int b= input.nextInt();
			convert.celsiusToFahrenheit(b);
	}
	
}
}

