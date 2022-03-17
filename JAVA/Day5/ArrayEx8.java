
public class ArrayEx8 {

	public static void main(String[] args) {
		int[][] array1 = new int[5][5];
		int[][] array2 = new int[5][5];
		//1~25사이의 난수를 생성후 5행5열의 배열에저장
		//두개의 배열에 같은 위치의 저장된 데이터를 비교하고 동일한 데이터라면 출력
		//배열내에서 같은위치의 동일한 데이터 개수를 출력
		for(int ri=0; ri<array1.length; ri++) {
			for(int ci=0; ci<array2[ri].length; ci++) {
			array1[ri][ci] = (int)(Math.random()*25+1);
			array2[ri][ci] = (int)(Math.random()*25+1);
			}
		}
		System.out.println("첫번째배열 값");
		for (int ri=0; ri<array1.length; ri++) {
			for (int ci=0; ci<array1[ri].length; ci++) {
				System.out.print(array1[ri][ci]+" ");
			}
			System.out.println();
			}
		System.out.println("두번째 배열 값");
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
					 System.out.println((ri+1)+"행"+(ci+1)+"열 = "+array2[ri][ci]+" ");
					 count+=1;
					 }
					 }
			 	}
			}	
	}
