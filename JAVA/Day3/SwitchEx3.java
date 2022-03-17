import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//정수(연도)를 키보드 입력으로 윤년인지 평년인지 출력
		//연도를 4로 나눈값이 0이면 윤년
		//연도가 100으로 나눈값이 0이면 평년
		//연도가 400으로 나눈값이 0이면 윤년
		//4로 나눈값이 0이 아니면 평년 > else에 해당
			Scanner Input = new Scanner(System.in);
			System.out.println("연도를 입력하세요");
			int num = Input.nextInt();
			switch(num%4) {
			case 0 :
				if(num%100 !=0 || num%400 ==0) {
					System.out.println("윤년");
				}else {
					System.out.println("평년");break;}
					case 1:
					case 2:
					case 3:
						System.out.println("평년");}

			
			}
}