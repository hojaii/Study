import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Account a2 = new Account("CUST01", "������", "1-22-333", 100000);
		a2.printAccount();//������ ���
		int menu = 0;//�Է� ����  �޴� �� ���� 
		int amount = 0;  //�Է� ����  �ݾ� ���� 
		do {
			menu = getMenuItem(); //�޴� �Է� ����
			switch (menu) {
			case 1:
				amount = getAccount();//�ݾ� �Է¹���
				a2.addBalance(amount);
				System.out.println("==============");
				System.out.println("���� �ܾ� : " + a2.getBalance());
				System.out.println("==============");
				break;
			case 2:
				amount = getAccount();
				a2.substractBalance(amount);
				System.out.println("==============");
				System.out.println("���� �ܾ� : " + a2.getBalance());
				System.out.println("==============");
				break;
			case 9:
				System.out.println("Bye~ ");
				System.exit(0);
			}
		} while (menu != 9);

	}

	public static int getUserInput() {
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		return menu;
	}
	public static int getMenuItem() {
		System.out.println("[  Menu  ] ");
		System.out.println("1. �Ա�");
		System.out.println("2. ��� ");
		System.out.println("9. ���� ");
		System.out.print("=> Menu ���� : ");
		return getUserInput();
	}
	public static int getAccount() {
		Scanner input = new Scanner(System.in);
		System.out.print("�ݾ� : ");
		return getUserInput();
	}

}
