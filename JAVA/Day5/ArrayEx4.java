import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		int[]nums = new int[10];
		//1~100사이의 난수 10개 저장
		//배열의 인덱스 번호 2개를 사용자로부터 키보드 입력받음
		//입력받은 배열의 인덱스 번호에 저장된 데이터를 바꿔 저장
		for(int i=0; i<nums.length; i++) {
			nums[i]=(int)(Math.random()*100+1);
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+"  ");
			}
			System.out.println();
			Scanner input = new Scanner(System.in);
			System.out.println("첫번째 인덱스 입력");
			int num1 = input.nextInt();
			System.out.println("두번째 인덱스 입력");
			int num2 = input.nextInt();
			int temp = nums[num1];
			nums[num1] = nums[num2];
			nums[num2] = temp;
			System.out.println("배열 데이터 전환 후");
			for(int i=0; i<nums.length; i++) {
				System.out.print(nums[i]+"  ");
			}
		}
}
