import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
			Scanner Input = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���");
			int num = Input.nextInt();
			if(num<=100 && num>=90){
				System.out.println(num + "��");
			System.out.println("A");}
			else if(num >= 80) {
				System.out.println(num + "��");
				System.out.println("B");}
			else if (num >= 70) {
				System.out.println(num + "��");
				System.out.println("C");}
			else if (num >= 60) {
				System.out.println(num + "��");
				System.out.println("D");}
			else if (num >= 50) {
				System.out.println(num + "��");
				System.out.println("E");}
			else if (num >= 0) {
				System.out.println(num + "��");
				System.out.println("F");}
			}
	}


