
public class Ex5 {

	public static void main(String[] args) {
		// �����ý�Ʈ�� �� ���ϱ� 3�ڸ����� ����(100~999)�� ���� 100�� �ڸ��� 10���ڸ��� 1���ڸ����� ���ϰ�
		//�� �ڸ����� 3�����Ͽ� ���Ѽ��� ������ ���Ͱ������� ���ؼ� ���ٸ� ����ϰ� �� ���� ����?
		int count = 0;
		for(int i=100; i<1000; i++){
			int a = i/100;
			int b = (i%100)/10;
			int c = i%10;
			if(i == (a*a*a+b*b*b+c*c*c)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("�����ý�Ʈ���� ������"+count);
		}

}
