
public class ConvertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 3; 
		int b= a; //promotion
		System.out.println(a);
		System.out.println(b);
		//byte c = b; //컴파일 오류
		byte c= (byte) b; //casting
		System.out.println(c);
		double d = 0.5;
		float f = (float)d;
		long n1 = (long)f;
		System.out.println(d);
		System.out.println(f);
		System.out.println(n1);
		boolean b1 = false ;
		//int num = b1; //프로모션불가능
		//byte b2 = b1;
		byte b3 = 1 ;
		//boolean b4 = b3; // 프로모션 불가능
		//boolean b4 = (boolean)b3; //컴파일오류
		
		short s1 = 65;
		char ch1 = (char)s1;
		
		char ch2 = 'a';
		s1= (short)ch2;
		
		s1 = (short)ch2;
		
		char ch3 = (char)b3 ;
		
		byte b4 = 4;
				short s6 = b4 ;
				
				
		
		
	}

}
