
public class ArrayEx1 {

	public static void main(String[] args) {
		int[] nums; //�迭����
		nums = new int[10]; //�迭���� , �ڵ��ʱ�ȭ
		System.out.println(nums.length);
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(1%2==1) nums[i]=i*10;
		}
		System.out.println("�ѤѤѤ�");
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums["+i+"]="+nums[i]);
	}

}
}