
public class whileEx1 {

	public static void main(String[] args) {
		int num = 1;
		int num2 = 1;//카운트 변수에 대한초기화
//		while(num<11) { //조건
//			System.out.println(num);
//			num++; //카운트 변수 증감식
//		}
		System.out.println();
		num = 1;
//		while(num<11){
//			if(num%2 ==1)
//			System.out.println(num);
//			num++;
//		}
		System.out.println();
		num=90;
//		while(num>64) {
//			System.out.println((char)num + " ");
//			num--;
//		}
//		System.out.println();
		num = 2;
		num2 = 1;
		while (num<10) {
			while(num2<10)  {
			System.out.print(num*(num2)+" ");//2,6,...72
			num2++;
			}
			}
		 
		}
	}


