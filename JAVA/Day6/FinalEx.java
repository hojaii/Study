
public class FinalEx {
	
	int num;
	final int PORT=8080; //변경될수없음
	public static void main(String[] args) {
		
		FinalEx ex = new FinalEx();//객체생성
		System.out.println(ex.num);
		System.out.println(ex.PORT);
		ex.num=1000;
		System.out.println(ex.num);
		//ex.PORT =9000;

	}

}
