
public class ForEx3 {

	public static void main(String[] args) {
		// for�� ���ο��� for�� ���ǰ���
		System.out.println("main start");
		int i= 1;
		for (int row = 0; row < 5; row++) { // �� �ݺ� Ƚ��
			for (int col = 0; col < 5; col++) { // �� �ݺ� Ƚ��
				System.out.print(col + i+ "  ");				
			}
			i+=5;
			
			System.out.println();
		}
		System.out.println("main end");

	}

}