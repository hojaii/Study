
public class FinalEx {
	
	int num;
	final int PORT=8080; //����ɼ�����
	public static void main(String[] args) {
		
		FinalEx ex = new FinalEx();//��ü����
		System.out.println(ex.num);
		System.out.println(ex.PORT);
		ex.num=1000;
		System.out.println(ex.num);
		//ex.PORT =9000;

	}

}
