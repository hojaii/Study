
public class ArrayEx2 {

	public static void main(String[] args) {
		int[] nums = new int[10]; //�迭 ���� ����, �ڵ� �ʱ�ȭ
		char[] chars = new char [] {'d', 'o', 'g','&',  'c', 'a', 't'};
//		System.out.println(chars.length);
//		for(int i=0; i<chars.length;i++) {
//			//System.out.println("chars["+i+"]="+chars[i]);
//			System.out.print(chars[i]);
//		}
		//1~100������ ���� 10���� �����Ͽ� �迭�� ����
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*100+1);
		}
		//�迭�� ����� ������ ���
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		//�ִ밪 ã��
		int max = nums[0];
		for(int i=1; i<nums.length;i++) {
			if(max<nums[i]) max=nums[i];
		}
		System.out.println("�迭 ������ �߿��� max����"+max);
	}

}
