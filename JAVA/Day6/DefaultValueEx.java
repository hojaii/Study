
public class DefaultValueEx {
	boolean success;
	int num;
	char ch;
	double d;
	String s; // reference type(Ŭ����, �迭, �������̽�)
	
		public static void main (String[] args) {
			//main�޼����� �����ڴ� DefaultValueEx�� �ƴϸ�
			//main�޼���� ����ÿ� JVM�� ���ؼ� ����Ǵ� Ư���� �޼���
			//static �޼����̹Ƿ� non-static��ü�̰ų� �ʵ�, �޼���� �ݵ�� ��ü�� ���� �� ���
			DefaultValueEx ex=new DefaultValueEx(); //��ü����
			System.out.println(ex.success);
			System.out.println(ex.num);
			System.out.println(ex.ch);
			System.out.println(ex.d);
			System.out.println(ex.s);
		}
}
