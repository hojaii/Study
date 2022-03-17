
public class Ex5 {

	public static void main(String[] args) {
		// 나르시스트의 수 구하기 3자리양의 정수(100~999)만 실행 100의 자리수 10의자리수 1의자리수를 구하고
		//각 자리수를 3제곱하여 더한수와 원래의 수와같은지를 비교해서 같다면 출력하고 이 수의 갯수?
		int count = 0;
		for(int i=100; i<1000; i++){
			int a = i/100;
			int b = (i%100)/10;
			int c = i%10;
			if(i == (a*a*a+b*b*b+c*c*c)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("나르시스트수의 갯수는"+count);
		}

}
