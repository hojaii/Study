
public class Calc {
	public void process(int n1, int n2, String op) { //������� �� ���
		//if�Ǵ� switch������ �����ڿ� ���� ���� ���� ���
		switch(op) {
		case "+" : System.out.println(n1+ "+"+ +n2+"="+(n1+n2));break;
		case "-" : System.out.println(n1+ "-"+ +n2+"="+(n1+n2));break;
		case "*" : System.out.println(n1+ "*"+ +n2+"="+(n1+n2));break;
		case "/" : System.out.println(n1+ "/"+ +n2+"="+(n1+n2));break;
		case "%" : System.out.println(n1+ "+"+ +n2+"="+(n1+n2));break;
		default :
			System.out.println("������ �������� �ʽ��ϴ�");
			
		}
	}
	public int returnprocess(int n1, int n2, String op) { //��� ���� �� ����� ��ȯ
		int result = 0;
		switch(op) {
		case "+" : result = (n1+n2); break;
		case "-" : result = (n1-n2); break;
		case "*" : result = (n1*n2); break;
		case "/" : result = (n1/2); break;
		case "%" : result = (n1%n2); break;
		default :
			result = -1;
		}
		return result;
	}
	public static void main(String[] args) {
		//process(3, 5, "*"); //static�޼��尡 �ƴϹǷ� �����ھ��� �޼��� ȣ�� �Ұ���
		Calc c1 = new Calc(); //Calc Ŭ������ ��ü�� ����
		c1.process(3,  5, "*");
		int r = c1.returnprocess(3,  5, "*");
		System.out.println(r);
		System.out.println(c1.returnprocess(4,  7, "+"));
	}
}
