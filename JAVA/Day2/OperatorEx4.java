
public class OperatorEx4 {

	public static void main(String[] args) {
		int num1 = 3, num2 = 5, num3= 7 ;
		//�� ������ : ���ǽ�&���ǽ� , ���ǽ� || ���ǽ�
		//�� �������� ����� boolean
		//&&�� ���ǽ� 1�� ���ǽ�2�� true�϶��� true��ȯ
		//&&�� ���ǽ� 1�� ���ǽ�2�� �ϳ��� true�̸� true��ȯ, ���ǽ�1�� ���ǽ�2�� false�϶��� false��ȯ
		
		boolean result = num2 > num1 && num3 ==num1 ; //true && false
		System.out.println(result);
		result = num2 > num1 || num3 == num1; //true || false
		System.out.println(result);
		result = num2 < num1 || num3 == num1; //false || false
		System.out.println(result);
		���ǽ�1 && ���ǽ�2 ���� ���ǽ� 1�� false�̸� ���ǽ�2�¼��� ���� false�� ��ȯ : short circult������
		
		

	}

}
