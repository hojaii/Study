class MyNumber{
	private int num=1;
	public void setNum(int num) {
		//MyNumber my = new MyNumber();
		this.num=num; //�Ķ���ͷ� ���޵� ������ ��� ���� num����
	}
	public int getNum() {
		return num;
	}
}
public class PrivateEx {

	public static void main(String[] args) {
		MyNumber my = new MyNumber();
		System.out.println(my.getNum());
		my.setNum(100);
		System.out.println(my.getNum());

	}

}
