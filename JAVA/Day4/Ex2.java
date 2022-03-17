
public class Ex2 {

	public static void main(String[] args) {
		//1~100숫자중 3이나오면 박수 3이 안나오면 숫자 출력
		for(int i=1; i<101; i++) {
			if(i%3 == 0)
				System.out.println("박수");
			else 
				System.out.println(i);
		}			
		}
}