package pkg2;

public class Child extends Parent{
	
	public void read() {
		System.out.println(name);
		name = "Child";
		System.out.println(name);
	}

	public static void main(String[] args) {
		Child c= new Child();
		c.read();

	}

}
