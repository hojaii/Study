
public class ArrayEx1 {

	public static void main(String[] args) {
		int[] nums; //배열선언
		nums = new int[10]; //배열생성 , 자동초기화
		System.out.println(nums.length);
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums["+i+"]="+nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(1%2==1) nums[i]=i*10;
		}
		System.out.println("ㅡㅡㅡㅡ");
		for(int i=0; i<nums.length; i++) {
			System.out.println("nums["+i+"]="+nums[i]);
	}

}
}