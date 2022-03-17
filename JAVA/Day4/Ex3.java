import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//사용자로부터 입력받은 정수의 약수들을 출력하고 약수들의 합출력
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int num = input.nextInt();
		int total =0;
		for (int i=1; i<=num+1; i++) {
			if(num%i == 0) {
				total +=i;
				System.out.println(i+" ");
			}
		}
	}
}
