
public class ForEx4 {

	public static void main(String[] args) {
		// for�� ���ο��� for�� ���ǰ���
		System.out.println("main start");
		for (int row = 0; row <5 ; row++) { // �� �ݺ� Ƚ��
			for (int col = 0; col <row; col++) { // �� �ݺ� Ƚ��
				System.out.print(" ");
				}
			for (int col=row; col<5; col++)
				System.out.print("*");
				System.out.println();
				}
				System.out.println("main end");		
	}
}