class Parent4 {
	public final  void method() {
	   System.out.println("Parent's method() called");
   }    
}
class Child4 extends Parent4 {
	//public void method() {//override 메서드 , 컴파일 에러
		   System.out.println("Child's method() called");		    
	} 	 
}
public class FinalEx {
	public static void main (String[] args) {
		Child4 child = new Child4();
		}
}
