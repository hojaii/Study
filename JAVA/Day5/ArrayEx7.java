public class ArrayEx7 {
	
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		//1~100������ ������ ������ �迭�� ����
		//�迭�� ����� �����߿��� 7�� ����� ���(�迭�� �ε����� ���� ���� ���)
		for(int ri=0; ri<nums.length; ri++) {
			for(int ci=0; ci<nums[ri].length; ci++) {
			nums[ri][ci] = (int)(Math.random()*100+1);
			}
		}
		for (int ri=0; ri<nums.length; ri++) {
			for (int ci=0; ci<nums[ri].length; ci++) {
				if (nums[ri][ci]%7 ==0)
					System.out.println(nums[ri][ci]+" ");
			}
		}
}
}