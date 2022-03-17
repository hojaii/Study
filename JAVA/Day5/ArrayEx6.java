
public class ArrayEx6 {

	public static void main(String[] args) {
		int[][] nums = new int[][] {{10},
									{20, 30},
									{40, 50, 60}};
//			int[][] nums; //배열선언
//		nums = new int[5][5]; //배열생성
		System.out.println(nums.length); //행 size (1차원 배열개수)
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i].length); //1차원 배열의 요소 개수
		}
		for (int ri=0; ri<nums.length; ri++) {
			for (int ci=0; ci<nums[ri].length; ci++) {
				System.out.print(nums[ri][ci]+" "); //1차원 배열의 요소개수
			}
				System.out.println();
		}
		
		
									
	}

}
