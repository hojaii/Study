
public class OperatorEx3 {

	public static void main(String[] args) {
		int num1 = 3 , num2 =5 ;
		//�񱳿����� : >, >=, <, <=, ==, !=, instanceof
		//�񱳿������� ����� boolean
		boolean result = num2 == num1 ;//�⺻ ������Ÿ�Կ����� ��������
		System.out.println(result);
		result = num2 != num1 ;
		System.out.println(result);
		String s1 = new String("java"); //���ڿ��� reference type���� s1����ü
		String s2 = new String("java"); //s2�� StringŬ�����κ��� ������ ��ü
		result = s1 == s2;
		System.out.println(result);
		result = s1.equals(s2); //���ڿ� �����
		System.out.println(result);
		

	}

}
