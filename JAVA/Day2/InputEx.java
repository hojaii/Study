import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		//표준입력은 키보드 입력입니다.
		//자바에서 키보드입력 객체는 System.In(InputStream)
		System.out.print("이름을 입력하세요>>");
		Scanner Input = new Scanner(System.in);
		String name = Input.next();
		System.out.println(name);
		System.out.print("1~100사이의 정수값을 입력하세요>>");
		int num = Input.nextInt();
		System.out.println(num);
		
	}

}
