import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("정수값을 입력하세요>>");
		int num = Input.nextInt();
		if (num<=0)
			System.out.println("1이상의 정수값만 입력해주세요");
		if (num%2 ==0&& num!=0) {
		System.out.println(num);
		System.out.println("짝수");
		}else if (num%2 ==1&& num!=0)		{
				System.out.println("홀수");
		}
		
	}

}