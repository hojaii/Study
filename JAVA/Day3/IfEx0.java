import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("1~100사이의 정수값을 입력하세요>>");
		int num = Input.nextInt();
		if (num>1 && num <= 100) {
		System.out.println(num);
		System.out.println("pass");
		}else {
				System.out.println("더 이상 수행할 수 없으므로 프로그램을 종료합니다");
		}
		
	}

}