class Parent{
	String name = "parent";
}
class Child extends Parent{
	String name = "child";
	public void read() {
		String name = "local"; //���ú���
		System.out.println(name); //���ú��� ���
		System.out.println(this.name); //������� ���
		System.out.println(super.name);//�θ�κ��� ��ӹ��� �������
	}
}
public class ExtendsEx {

	public static void main(String[] args) {
		Child child = new Child();
		//System.out.println(child.name);

	}

}
