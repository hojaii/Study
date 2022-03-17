
public class ForEx4 {

	public static void main(String[] args) {
		// for문 내부에도 for문 정의가능
		System.out.println("main start");
		for (int row = 0; row <5 ; row++) { // 행 반복 횟수
			for (int col = 0; col <row; col++) { // 열 반복 횟수
				System.out.print(" ");
				}
			for (int col=row; col<5; col++)
				System.out.print("*");
				System.out.println();
				}
				System.out.println("main end");		
	}
}