import java.util.Scanner;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] renum = new int[13];
		Scanner input = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�");
		String strNum = input.next();
		for (int i=0, j=0; i<strNum.length(); i++) {
			if(strNum.charAt(i) == '-') continue;
			renum[j++] = strNum.charAt(i)-'0';
		}
		for (int i=0; i<renum.length; i++) {
			System.out.print(renum[i]);
		}
		
		int digit = 2;
		int sum = 0;
		for(int i=0; i<renum.length-1; i++) {
			if (digit == 10) digit =2;
			sum += renum[i]*digit++;
		}
		int result = (11-sum%11)%10;
		if (renum[12] == result) {
			System.out.println("CORRECT");
		}else {
			System.out.println("INCORRECT");
		}
		if (renum[6] == 9 || renum[6] ==1 || renum[6]==3) {
			System.out.println("���� : ��");
		}
			else if (renum[6]==0 || renum[6] ==2 || renum[6] ==4) {
				System.out.println("���� : ��");
			}
		
		//�ֹι�ȣ üũ
		//����ڷκ��� �ֹι�ȣ �Է¹��� : 000000-0000000 (���ڿ��� ����)
		//-�� ���ܽ�Ű�� �ѹ��� �ѹ��ڸ� ������ ��ȯ�ؼ� int[]������ (�迭�� ũ��� 13)
		//13�ڸ� ���� ��Ʈ�� �߿��� �տ������� 12�ڸ��� ���� ��Ʈ���� �� ���ڷ� �����ϸ�
		//�� �ڸ��� ���Ѽ��� ��� ���Ͽ� ������ ���մϴ�
		//������ 11�� ���� �������� ���մϴ�
		//�� �������� 11���� �� ����� CHECK DIGIT�Դϴ�.
		//�� ����� 2�ڸ����� ��쿡 2�ڸ����� 10���� ���� �������� CHECK DIGIT�� �˴ϴ�
		//CHECK DIGIT�� ���� �Է� ���� ��Ʈ���� 13��° ���ڿ� ������ "CORRECT" �ٸ��� "INCORRECT"
		//HINT > (11-������)%10 �Ǵ� (11-total%11)%10

	}

}
