import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���>>");
		int num = Input.nextInt();
		if (num<=0)
			System.out.println("1�̻��� �������� �Է����ּ���");
		if (num%2 ==0&& num!=0) {
		System.out.println(num);
		System.out.println("¦��");
		}else if (num%2 ==1&& num!=0)		{
				System.out.println("Ȧ��");
		}
		
	}

}