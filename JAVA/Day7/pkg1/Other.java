package pkg1;

public class Other {
	public void read() {
		Parent p = new Parent();
		//System.out.println(p.name);
		//p.name = "Other";
		//System.out.println(p.name);
		System.out.println(p.getName());
		p.setName("Other");
		System.out.println(p.getName());
	}

	public static void main(String[] args) {
		Other o = new Other();
		o.read();

	}

}
