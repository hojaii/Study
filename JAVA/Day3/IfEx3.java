import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		//�ΰ��� ������ �ϳ��� ��������ڸ� �Է¹޾Ƽ�
		//���� ����� ���
		//ex)ù��° �����Է�:3
		//�ι�° �����Է� : 5
		//��������� ( * / + - %) : +
		//��¿��� 3+5=8
		//�ٸ� ������ �Է½� ���� ���� ������
		Scanner Input = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���");
		int num1 = Input.nextInt();
		System.out.print("���� ���ڸ� �Է����ּ���");
		int num2 = Input.nextInt();
		System.out.print("�����ڸ� �Է����ּ���");
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
			System.out.println("�ش� �����ڸ� �������� �����ϴ�") ;}
		if(flag) {
			System.out.println(num1 + ""+oper + num2 + "=" + result);}
		}
		
		
		
		}
		