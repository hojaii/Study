
public class ArrayEx2 {

	public static void main(String[] args) {
		int[] nums = new int[10]; //배열 선언 생성, 자동 초기화
		char[] chars = new char [] {'d', 'o', 'g','&',  'c', 'a', 't'};
//		System.out.println(chars.length);
//		for(int i=0; i<chars.length;i++) {
//			//System.out.println("chars["+i+"]="+chars[i]);
//			System.out.print(chars[i]);
//		}
		//1~100사이의 난수 10개를 생성하여 배열에 저장
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*100+1);
		}
		//배열에 저장된 데이터 출력
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		//최대값 찾기
		int max = nums[0];
		for(int i=1; i<nums.length;i++) {
			if(max<nums[i]) max=nums[i];
		}
		System.out.println("배열 데이터 중에서 max값은"+max);
	}

}
