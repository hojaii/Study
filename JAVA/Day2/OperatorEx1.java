
public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3 , num2 =5;
		int result = -num1; //sign������
		System.out.println(result);
		result = ~num1; //1�Ǻ��� 
		System.out.println(result);
		num1 = 7;
		result = ~num1; //1�Ǻ���
		System.out.println(result);
		
		//���������ڴ� ����, ���� �����ڷ� ��밡��
		result = ++num1 + ++num2 ;
		result = num1++ + num1++;
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
		//System.out.println(!num2);
		//!���� ������ true�� false��, false�� true�� ��ȯ�ϹǷ� booleanŸ�԰� ����ǥ���Ŀ����� ��밡��
		boolean flag = false;
				System.out.println(!flag);
		flag = 3>4 ; //�񱳿��� ���
		System.out.println(flag);
		flag = !(3>4) ; //����ǥ����, !�������
		System.out.println(flag);
		
		
		
	}

}
