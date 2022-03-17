class Call{
	public Call() {
		System.out.println("0");
	}
	public Call(String name) {
		this();
		//this(name, "02");
		System.out.println("1");		
	}
	public Call(String name, String phoneno) {
		this(name);
		//this();
		System.out.println("2");
		
	}
}
public class CallTest2 {
	
	public static void main(String[] args) {
		//Call test = new Call();
		//Call test = new Call("BIT");
		Call test = new Call("BIT", "02-3486-3456");
		//Call test = new Call ("BIT", "02-3486-3456", "°­³²");
	}
	

}
