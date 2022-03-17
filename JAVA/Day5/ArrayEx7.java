public class ArrayEx7 {
	
	public static void main(String[] args) {
		int[][] nums = new int[5][5];
		//1~100사이의 난수를 생성후 배열에 저장
		//배열에 저장된 정수중에서 7의 배수만 출력(배열의 인덱스와 값을 같이 출력)
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