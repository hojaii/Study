import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//����(����)�� Ű���� �Է����� �������� ������� ���
		//������ 4�� �������� 0�̸� ����
		//������ 100���� �������� 0�̸� ���
		//������ 400���� �������� 0�̸� ����
		//4�� �������� 0�� �ƴϸ� ��� > else�� �ش�
			Scanner Input = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���");
			int num = Input.nextInt();
			switch(num%4) {
			case 0 :
				if(num%100 !=0 || num%400 ==0) {
					System.out.println("����");
				}else {
					System.out.println("���");break;}
					case 1:
					case 2:
					case 3:
						System.out.println("���");}

			
			}
}