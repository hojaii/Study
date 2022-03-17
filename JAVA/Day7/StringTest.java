
public class StringTest {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] bytes = new byte[] {65, 66, 67, 68, 69};
		String s2 = new String(bytes);
		String s3 = new String("java");
		System.out.println(s2.charAt(0));
		String s6 = new String("오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아간다");
		System.out.println(s6.substring(16));
		System.out.println(s6.substring(5, 14));

//		String s5=s3.toUpperCase();
//		System.out.println(s3);
//		System.out.println(s5);
//		s3 = new String("  ja  va  ");
//		System.out.println(s3.length());
//		System.out.println(s3.trim().length());


		
//		String s4 = s3.concat(", python");
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s3.equals("java"));
//		byte[] b3 = s3.getBytes();
//		for (byte b : b3) // for(변수 : 집합객체)
//			System.out.println(b);
//		System.out.println(s1.isEmpty());
//		System.out.println(s2.length());
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
	}

}
