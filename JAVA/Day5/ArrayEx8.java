
public class ArrayEx8 {

	public static void main(String[] args) {
		int[][] array1 = new int[5][5];
		int[][] array2 = new int[5][5];
		//1~25������ ������ ������ 5��5���� �迭������
		//�ΰ��� �迭�� ���� ��ġ�� ����� �����͸� ���ϰ� ������ �����Ͷ�� ���
		//�迭������ ������ġ�� ������ ������ ������ ���
		for(int ri=0; ri<array1.length; ri++) {
			for(int ci=0; ci<array2[ri].length; ci++) {
			array1[ri][ci] = (int)(Math.random()*25+1);
			array2[ri][ci] = (int)(Math.random()*25+1);
			}
		}
		System.out.println("ù��°�迭 ��");
		for (int ri=0; ri<array1.length; ri++) {
			for (int ci=0; ci<array1[ri].length; ci++) {
				System.out.print(array1[ri][ci]+" ");
			}
			System.out.println();
			}
		System.out.println("�ι�° �迭 ��");
		for (int ri=0; ri<array2.length; ri++) {
			for (int ci=0; ci<array2[ri].length; ci++) {
				System.out.print(array2[ri][ci]+" ");
				}
				System.out.println();
			}
			 int count =0;
			 for (int ri=0; ri<array1.length; ri++) {
				 for (int ci=0; ci<array1[ri].length; ci++) {
					 if (array1[ri][ci] == array2[ri][ci]) {
					 System.out.println((ri+1)+"��"+(ci+1)+"�� = "+array2[ri][ci]+" ");
					 count+=1;
					 }
					 }
			 	}
			}	
	}
