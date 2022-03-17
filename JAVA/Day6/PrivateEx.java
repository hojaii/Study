class MyNumber{
	private int num=1;
	public void setNum(int num) {
		//MyNumber my = new MyNumber();
		this.num=num; //파라미터로 전달된 값으로 멤버 변수 num변경
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
