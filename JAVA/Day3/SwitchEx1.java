import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = Input.nextInt();
		char rank = ' ';
		switch(num/10) {
		case 10 : 
		case 9 :rank = 'A';break;
		case 8 :rank = 'B';break;
		case 7 :rank = 'C';break;
		case 6 :rank = 'D';break;
		case 5 :rank = 'E';break;
		default :
			rank = 'F';}
		System.out.println(num+"점"+rank);
		
		
		
		}
		
		}
		
	