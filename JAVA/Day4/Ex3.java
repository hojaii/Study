import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//����ڷκ��� �Է¹��� ������ ������� ����ϰ� ������� �����
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		int num = input.nextInt();
		int total =0;
		for (int i=1; i<=num+1; i++) {
			if(num%i == 0) {
				total +=i;
				System.out.println(i+" ");
			}
		}
	}
}
