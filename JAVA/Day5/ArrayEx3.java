
public class ArrayEx3 {
	public static void main(String[] args) {
		int[] nums = new int[10]; //�迭 ���� ����, �ڵ� �ʱ�ȭ
		//1~10���� ���� 10���� ����
		//�迭�� ��� ���� ���հ� ����� ���
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*10+1);
		}	
		double sum = 0;
		for (int i=0; i<nums.length;i++) {
			sum += nums[i];
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+", ");
		}
		System.out.println();
		System.out.println("�迭 ��� ���� : " + sum );
		System.out.println("�迭 ����� ��� : " + sum/nums.length);
		System.out.println("�迭 ����� ��� : " + (int)sum/nums.length);
		

}
	
}
