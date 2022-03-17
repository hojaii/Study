
public class Account {
	private String CustId;
	private String CustName;
	private String accountNumber;
	private int balance;
	public Account() {		
	}
	public Account(String custId, String custName, String accountNumber, int balance) {
		this.CustId = custId;
		this.CustName = custName;
		this.accountNumber = accountNumber;
		if(balance <1 ) {
			System.out.println("잔액 오류 입니다 :"+ balance + "원");
			System.exit(0);//강제종료	
		} else {
			this.balance = balance;
		}
	}
	public String getCustId() {
		return CustId;			
	}
	public void setCustId(String custId) {
		this.CustId = custId;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		this.CustName = custName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void addBalance(int amount) {
		if (amount < 1) {
			System.out.println("금액 오류입니다 :" + amount + "원");
		} else {
			this.balance += amount;
			System.out.println(amount+"원을 입금합니다. "  );
		}
	}
	
	public void substractBalance(int amount) {
		if (amount <1 ) {
			System.out.println("금액 오류입니다 :" + amount + "원");
		} else if (amount > balance) {
			System.out.println("출금 불가!! 잔고가 부족합니다");
		} else {
			this.balance -= amount;
			System.out.println(amount+ "원을 출금합니다.");
		}
	}
	public void printAccount() {
		System.out.println("====================== "  );
		System.out.println("고객번호 : " + CustId  );
		System.out.println("고객명 : " + CustName  );
		System.out.println("계좌번호 : " + accountNumber  );
		System.out.println("잔액 : " + balance  );
		System.out.println("====================== "  );
	}

}