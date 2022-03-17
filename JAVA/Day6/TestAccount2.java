
public class TestAccount2 {

	public static void main(String[] args) {
		
		Account2 account1 = new Account2("CUST01", "±èÃ¶¼ö", "11-222-3333", 100000);
		account1.printAccountInfo();
		System.out.println( );
		account1.deposit(30000);		 
		System.out.println( );
		account1.deposit(-10000);		 
		System.out.println( );
		account1.withdraw(50000);		 
		System.out.println( );
		account1.withdraw(100000);		 
		System.out.println( );
		account1.withdraw(-10000);		 
		System.out.println( );
		account1.deposit(20000);		 
		System.out.println( );
		account1.withdraw(50000);		 
		System.out.println( );

	}

}