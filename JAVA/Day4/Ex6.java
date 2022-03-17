
public class Ex6 {

	public static void main(String[] args) {
//		고집수 구하기
//		2자리의자리의 양의 정수만 처리합니다.(범위 10~99)
//		2자리의 각 자릿수를 분할하여 서로 곱합니다. 곱하여진 결과를 다시 각 자릿수로 분할하여 곱해 나갑니다
//		이러한 과정을 계속해 나가면 1의 자리의 수에 도달하게 되며, 곱해 나가는 반복 횟수를 고집수라합니다.
//		고집수가 4이상되는 수들만 출력하세요
		int total=0;
		for(int i=10; i<100; i++) {
			int a = i;
			int count=0;
			while (a>9) {
				a=a/10*(a%10);
				count++;
			}
			if (count >=4){
				System.out.println(i+count);
				total++;
			}
		}
		System.out.println(total+"개");
	}
}
