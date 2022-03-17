import java.util.Arrays;
import java.util.Random;

//¿¹½Ã <<Lotto>>
// 3 18 22 25 28 40
public class Lotto {
	public final static int LOTTO_NUM_CNT = 6;
	public int[] generateLottoNumbers() {
		int[] lottoNumbers = new int[LOTTO_NUM_CNT];
		for(int i=0; i<LOTTO_NUM_CNT; i++) {
			lottoNumbers[i] = getRandomNumber();
			for(int j=0; j<i; j++) {
				if (lottoNumbers[j]==lottoNumbers[i]) {
					--i;
				}
			}
		}
		return lottoNumbers;
	}
	public void displayLottoNumbers(int[] lottoNumbers) {
		sortLottoNumbers(lottoNumbers);
		System.out.println("<<Lotto>>");
		for (int n: lottoNumbers) {
		System.out.print(n+"  ");
		}
	}
	public void sortLottoNumbers(int [] lottoNumbers) {
		Arrays.sort(lottoNumbers);
	}
	private static int getRandomNumber() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(45) +1;
		return randomNumber;
	}

}
