
public class CalcTest {
	public void plus(int a, int b) {}
	public void plus(int a, int b, int... nums) { //가변파라미터 int...c
		System.out.println(nums.length);
		int sum = 0;
		for (int n:nums) {
			sum += n;
		}
		sum = sum+ a + b;
		System.out.println(sum);
	}
//	public void plus(int a, int b, int c, int d) {}
//	public void plus(int a, int b, int c, int d, int f) {}
	public static void main(String[] args) {
		CalcTest test = new CalcTest();
		test.plus(1, 2);
		test.plus(1, 2, 3);
		test.plus(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int[] nums = new int[] {11, 12, 13, 14, 15, 16};
		test.plus(1, 2, nums);
	}

}
