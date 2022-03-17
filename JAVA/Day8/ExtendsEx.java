class Parent{
	String name = "parent";
}
class Child extends Parent{
	String name = "child";
	public void read() {
		String name = "local"; //로컬변수
		System.out.println(name); //로컬변수 출력
		System.out.println(this.name); //멤버변수 출력
		System.out.println(super.name);//부모로부터 상속받은 멤버변수
	}
}
public class ExtendsEx {

	public static void main(String[] args) {
		Child child = new Child();
		//System.out.println(child.name);

	}

}
