
public class ArrayEx6 {

	public static void main(String[] args) {
		int[][] nums = new int[][] {{10},
									{20, 30},
									{40, 50, 60}};
//			int[][] nums; //�迭����
//		nums = new int[5][5]; //�迭����
		System.out.println(nums.length); //�� size (1���� �迭����)
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i].length); //1���� �迭�� ��� ����
		}
		for (int ri=0; ri<nums.length; ri++) {
			for (int ci=0; ci<nums[ri].length; ci++) {
				System.out.print(nums[ri][ci]+" "); //1���� �迭�� ��Ұ���
			}
				System.out.println();
		}
		
		
									
	}

}
