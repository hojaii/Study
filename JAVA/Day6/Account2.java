
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
			System.out.println("�ܾ� ���� �Դϴ� :"+ balance + "��");
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
			System.out.println("�ݾ� �����Դϴ� :" + money + "��");
		} else if (money > balance) {
			System.out.println("��� �Ұ�!! �ܰ� �����մϴ�");
		} else {
			this.balance -= money;
		}
		printAccountInfo();
	}
	public void deposit(int money) {
		System.out.println(money+"���� �Ա��մϴ�."  );
		if (money <0) {
			System.out.println("�ݾ� �����Դϴ�");
		} else {
			this.balance += money;
		}
		printAccountInfo();
	}
	public void printAccountInfo() {
		System.out.println("====================== "  );
		System.out.println("����ȣ : " + CustomerId  );
		System.out.println("���� : " + CustomerName  );
		System.out.println("���¹�ȣ : " + accountNumber  );
		System.out.println("�ܾ� : " + balance  );
		System.out.println("====================== "  );
	}
}
