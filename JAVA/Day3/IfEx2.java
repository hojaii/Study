import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		//����(����)�� Ű���� �Է����� �������� ������� ���
		//������ 4�� �������� 0�̸� ����
		//������ 100���� �������� 0�̸� ���
		//������ 400���� �������� 0�̸� ����
		//4�� �������� 0�� �ƴϸ� ��� > else�� �ش�
			Scanner Input = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���");
			int num = Input.nextInt();
			if ((num%4 == 0 && num%100 !=0) || num%400 ==0) {
				System.out.println("����");}
			else {
				System.out.println("���");}
			
			}
}