
public class ArrayEx5 {

	public static void main(String[] args) {
		//char배열 생성후 알파벳 대문자 A부터 Z까지 저장 후 역순출력
		char[] chars = new char[26];
		for(int i=0; i<chars.length; i++) {
			chars[i] = (char)(i+65);
		}
		for(int i=0; i<chars.length; i++) {
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		for(int i=chars.length-1; i>=0; i--) {
			System.out.print(chars[i]+ " ");
		}
	

}
}

