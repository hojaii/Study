package workshop5.entity;

import java.util.Scanner;

public class BookUtil {
	public static String getUserInput() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public static void printHead() {
     System.out.println("-------------------------------도서 정보 ----------------------------------");
	}

	public static void printTail() {
		System.out.println("----------------------------------------------------------------------------");
	}
}
