import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[]nums = new int[10];
		//1~100������ ���� 10�� ����
		//�迭�� �ε��� ��ȣ 2���� ����ڷκ��� Ű���� �Է¹���
		//�Է¹��� �迭�� �ε��� ��ȣ�� ����� �����͸� �ٲ� ����
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*100+1);
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+"  ");
			}
			System.out.println();
			Scanner input = new Scanner(System.in);
			System.out.println("ù��° �ε��� �Է�");
			int num1 = input.nextInt();
			System.out.println("�ι�° �ε��� �Է�");
			int num2 = input.nextInt();
			int temp = nums[num1];
			nums[num1] = nums[num2];
			nums[num2] = temp;
			System.out.println("�迭 ������ ��ȯ ��");
			for(int i=0; i<nums.length; i++) {
				System.out.print(nums[i]+"  ");
			}
		}
}
