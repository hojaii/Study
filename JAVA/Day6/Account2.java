
public class Account2 {
	private String CustomerId;
	private String CustomerName;
	private String accountNumber;
	private int balance;
	public Account2(String CustomerId, String CustomerName, String accountNumber, int balance) {
		this.CustomerId = CustomerId;
		this.CustomerName = CustomerName;
		this.accountNumber = accountNumber;
		if(balance <1 ) {
			System.out.println("잔액 오류 입니다 :"+ balance + "원");
			System.exit(0);
		} else {
			this.balance = balance;
		}			
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public String getaccountNumber() {
		return accountNumber;
	}
	public int getbalance() {
		return balance;
	}
	public void withdraw(int money) {
		if (money <1 ) {
			System.out.println("금액 오류입니다 :" + money + "원");
		} else if (money > balance) {
			System.out.println("출금 불가!! 잔고가 부족합니다");
		} else {
			this.balance -= money;
		}
		printAccountInfo();
	}
	public void deposit(int money) {
		System.out.println(money+"원을 입금합니다."  );
		if (money <0) {
			System.out.println("금액 오류입니다");
		} else {
			this.balance += money;
		}
		printAccountInfo();
	}
	public void printAccountInfo() {
		System.out.println("====================== "  );
		System.out.println("고객번호 : " + CustomerId  );
		System.out.println("고객명 : " + CustomerName  );
		System.out.println("계좌번호 : " + accountNumber  );
		System.out.println("잔액 : " + balance  );
		System.out.println("====================== "  );
	}
}
