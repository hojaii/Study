
public class Ex6 {

	public static void main(String[] args) {
//		������ ���ϱ�
//		2�ڸ����ڸ��� ���� ������ ó���մϴ�.(���� 10~99)
//		2�ڸ��� �� �ڸ����� �����Ͽ� ���� ���մϴ�. ���Ͽ��� ����� �ٽ� �� �ڸ����� �����Ͽ� ���� �����ϴ�
//		�̷��� ������ ����� ������ 1�� �ڸ��� ���� �����ϰ� �Ǹ�, ���� ������ �ݺ� Ƚ���� ���������մϴ�.
//		�������� 4�̻�Ǵ� ���鸸 ����ϼ���
		int total=0;
		for(int i=10; i<100; i++) {
			int a = i;
			int count=0;
			while (a>9) {
				a=a/10*(a%10);
				count++;
			}
			if (count >=4){
				System.out.println(i+count);
				total++;
			}
		}
		System.out.println(total+"��");
	}
}
