
public class OperatorEx6 {

	public static void main(String[] args) {
		int num1 =3, num2 =5, num3 =256 ;
		//shift ������ : << (left), >> (right), >>> (unsigned right)
		//��Ʈ�� �̵���Ŵ, ����� ���� ��ȯ
		int result = num1 << num2; //�������� bit�� �̵���Ű�� ������ ��Ʈ�� 0���� ä��
		//num1* 2^num2�� ����� ����
		System.out.println(result);
		result = num3 >> num1; //���������� bit�� �̵���Ű�� ���� bit�� sign��Ʈ�� ä��
		//num3 / 2^num1�� ����� ����
		System.out.println(result);
		result = -num3 >> num1; 
		System.out.println(result); //����� ������ ������ �������
		result = num3 >>> num1; //���������� bit�� �̵���Ű�� ���� bit�� ������ 0���� ä��
		System.out.println(result);//����� ������ ���
		result = -num3 >>> num1; 
		System.out.println(result);
		
		
		
		
}
}