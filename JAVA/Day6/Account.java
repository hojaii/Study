
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
			System.out.println("�ܾ� ���� �Դϴ� :"+ balance + "��");
			System.exit(0);//��������	
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
			System.out.println("�ݾ� �����Դϴ� :" + amount + "��");
		} else {
			this.balance += amount;
			System.out.println(amount+"���� �Ա��մϴ�. "  );
		}
	}
	
	public void substractBalance(int amount) {
		if (amount <1 ) {
			System.out.println("�ݾ� �����Դϴ� :" + amount + "��");
		} else if (amount > balance) {
			System.out.println("��� �Ұ�!! �ܰ� �����մϴ�");
		} else {
			this.balance -= amount;
			System.out.println(amount+ "���� ����մϴ�.");
		}
	}
	public void printAccount() {
		System.out.println("====================== "  );
		System.out.println("����ȣ : " + CustId  );
		System.out.println("���� : " + CustName  );
		System.out.println("���¹�ȣ : " + accountNumber  );
		System.out.println("�ܾ� : " + balance  );
		System.out.println("====================== "  );
	}

}