
public class ExtendsEx4 {

	public static void main(String[] args) {
		Object o = new Object();
		String s = new String();
		Integer iobj = new Integer(100);
		//객체 instanceof 타입 연산은 true/false 결과 생성
		//상속 관계가 없는 경우 instanceof 연산자 사용은 컴파일 오류 발생
		System.out.println((s instanceof String));
		System.out.println((s instanceof Object));
		System.out.println((o instanceof String));
		System.out.println((s instanceof Integer));

	}

}
