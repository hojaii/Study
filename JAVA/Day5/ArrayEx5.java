
public class ArrayEx5 {

	public static void main(String[] args) {
		//char�迭 ������ ���ĺ� �빮�� A���� Z���� ���� �� �������
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

