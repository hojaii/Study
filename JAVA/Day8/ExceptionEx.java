
public class ExceptionEx {
	
	public static void main(String[] args) {
		int num = 0;
		System.out.println("start");
		try {
			num = Integer.parseInt(args[0]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����ó�� 1");
		}catch(NumberFormatException e) {
			System.out.println("����ó�� 2");
		}finally {
			System.out.println("������ ����");
		}
		if(num%2==0) {
			System.out.println(num+"Even");
		}else if(num%2 ==1 && num!=0){
			System.out.println(num+"Odd");
		}
		System.out.println("end");
		}
	}


