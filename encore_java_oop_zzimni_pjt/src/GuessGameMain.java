import java.util.Random;

import com.encore.guessgame.GuessGame;

public class GuessGameMain {

	public static void main(String[] args) {
		Random rand = new Random();
		int hiddenNumber = rand.nextInt(100) + 1;
		System.out.println("***********************************\r\n"
				+ "1에서 100사이의 숫자를 맞춰보세요.\r\n"
				+ "10번의 기회가 있습니다.\r\n"
				+ "***********************************\r\n"
				+ "");
		
		// while로 구현하는 건 강사님 코드 참고하기
		for(int idx=1;idx<=10;idx++) {

			int inputNumber = GuessGame.getUserInput();
			
			if(inputNumber<1 || inputNumber>100) {
				System.out.println("1~100사이의 값을 입력하세요.");
				}
			else {
				if(inputNumber==hiddenNumber) {
					System.out.printf("축하합니다. %d번만에 맞추셨네요.",idx);
					return;
					}
				else if (inputNumber<hiddenNumber) {
					System.out.println(inputNumber+"보다 큽니다.");
					}
				else if (inputNumber>hiddenNumber) {
					System.out.println(inputNumber+"보다 작습니다.");
					}
				else if(idx==10){
					System.out.println("10번의 기회가 끝났습니다. 다시 한 번 시도해 보세요.");
					return;
					}
				}
			}
	}
}
