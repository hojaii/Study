import java.util.Scanner;

//메인 메서드에서 섭씨로 변화하고 싶으면 1, 화씨로 변화하고싶으면 2를 입력받고
//fahrenheitToCelsius메서드를 통해서 화씨를 섭씨로
//celsiusToFahrenheit메서드를 통해서 섭씨를 바꿔 출력하는 프로그램을 만드시오
//화씨 = 1.8*섭씨+32, 섭씨 = (화씨 - 32) /1.8
//출력예 
// == 메뉴 ==
//1. 화씨를 섭씨로 변환
//2.섭씨를 화씨로 변환
//==
//메뉴번호 : 1 >if문
//섭씨를 입력하세요:90 (int로 캐스팅)
//섭시로 변환된 온도는 32.2
public class CalcQ {
	
	public void fahrenheitToCelsius(int a) {
	
	}
	public void celsiusToFahrenheit(int b) {
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalcQ convert = new CalcQ();
		System.out.println("=====메뉴=====");
		System.out.println("1.화씨를 섭씨로 변환");
		System.out.println("2.섭씨를 화씨로 변환");
		System.out.println("=============");
		System.out.println("변환할 번호를 선택해주세요");
		double menu = input.nextInt();
		if (menu == 1) {
			System.out.println("변환할 화씨를 입력해주세요");
			int a = input.nextInt();
			convert.fahrenheitToCelsius(a);
		}else if(menu == 2) {
			System.out.println("섭씨를 입력해주세요");
			int b= input.nextInt();
			convert.celsiusToFahrenheit(b);
	}
	
}
}

