
public class ExtendsEx4 {

	public static void main(String[] args) {
		Object o = new Object();
		String s = new String();
		Integer iobj = new Integer(100);
		//��ü instanceof Ÿ�� ������ true/false ��� ����
		//��� ���谡 ���� ��� instanceof ������ ����� ������ ���� �߻�
		System.out.println((s instanceof String));
		System.out.println((s instanceof Object));
		System.out.println((o instanceof String));
		System.out.println((s instanceof Integer));

	}

}
