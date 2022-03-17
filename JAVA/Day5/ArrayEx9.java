import java.util.Scanner;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] renum = new int[13];
		Scanner input = new Scanner(System.in);
		System.out.print("주민번호 입력");
		String strNum = input.next();
		for (int i=0, j=0; i<strNum.length(); i++) {
			if(strNum.charAt(i) == '-') continue;
			renum[j++] = strNum.charAt(i)-'0';
		}
		for (int i=0; i<renum.length; i++) {
			System.out.print(renum[i]);
		}
		
		int digit = 2;
		int sum = 0;
		for(int i=0; i<renum.length-1; i++) {
			if (digit == 10) digit =2;
			sum += renum[i]*digit++;
		}
		int result = (11-sum%11)%10;
		if (renum[12] == result) {
			System.out.println("CORRECT");
		}else {
			System.out.println("INCORRECT");
		}
		if (renum[6] == 9 || renum[6] ==1 || renum[6]==3) {
			System.out.println("성별 : 남");
		}
			else if (renum[6]==0 || renum[6] ==2 || renum[6] ==4) {
				System.out.println("성별 : 여");
			}
		
		//주민번호 체크
		//사용자로부터 주민번호 입력받음 : 000000-0000000 (문자열로 받음)
		//-를 제외시키고 한문자 한문자를 정수로 변환해서 int[]에저장 (배열의 크기는 13)
		//13자리 숫자 스트림 중에서 앞에서부터 12자리의 숫자 스트링을 각 숫자로 분할하며
		//각 자리의 곱한수를 모두 더하여 총합을 구합니다
		//총합을 11로 나눈 나머지를 구합니다
		//그 나머지를 11에서 뺀 결과가 CHECK DIGIT입니다.
		//뺀 결과가 2자리수의 경우에 2자리수를 10으로 나눈 나머지가 CHECK DIGIT가 됩니다
		//CHECK DIGIT의 값이 입력 숫자 스트링의 13번째 숫자와 같으면 "CORRECT" 다르면 "INCORRECT"
		//HINT > (11-나머지)%10 또는 (11-total%11)%10

	}

}
