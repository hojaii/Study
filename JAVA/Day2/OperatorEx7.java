
public class OperatorEx7 {

	public static void main(String[] args) {
		int num1 =3, num2 =5;
		//��Ȳ������ : ������ ? true�϶� ǥ���� : false�϶� ǥ����
		double result = (num1>= num2)? 99.9 : 90 ;
		//�ϳ��� ����Ŀ��� ���� ū Ÿ������ boolean�� ������ ������ Ÿ���� �ڵ����� �±޵�
		int result2 = (int) ((num1 >= num2)? 99.9 : 90);
		System.out.println(result);
		System.out.println(result2);
		

	}

}
