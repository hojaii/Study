
public class ArrayEx3 {
	public static void main(String[] args) {
		int[] nums = new int[10]; //배열 선언 생성, 자동 초기화
		//1~10사의 난수 10개를 저장
		//배열의 모든 값을 총합과 평균을 출력
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
		System.out.println("배열 요소 총합 : " + sum );
		System.out.println("배열 요소의 평균 : " + sum/nums.length);
		System.out.println("배열 요소의 평균 : " + (int)sum/nums.length);
		

}
	
}
