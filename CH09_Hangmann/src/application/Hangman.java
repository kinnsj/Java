package application;

import java.util.Scanner;

// 전체 행맨 게임을 실행하는 클래스

public class Hangman {

	Scanner scanner = new Scanner(System.in);
	private boolean running = true;
	private Randomword word = new Randomword();
	boolean isCorrect;
	private char lastGuess;
	private int remainTries = 7;
	public void run() {
		do {
			displayWord(); // 화면에 단어표시
			getUserInput(); // 입력
			checkUserInput(); // 맞는지 체크 > 맞을시 running = false
		} while (running);
	}
	public void displayWord() {		
		System.out.println(word.toString());//랜덤으로 선택된 단어 출력

	}
	public void getUserInput() {
		//유저에게 한 문자 입력 요구
		//입력받은 문자열에서 한 문자를 뽀아서
		//Randomword 클래스에 전달
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		// 문자열에서 뱨낸 한 문자를 랜덤워드로 보냄
		lastGuess = guess.charAt(0);
	}
	public void checkUserInput() {
		boolean isCorrect = word.addGuess(lastGuess);
		if(word.isComplete()) {
		System.out.println("잘 맞췄어요!");
		System.out.println("시도횟수 : "+remainTries);
		System.out.println("정답은 : "+word);
		running = false;
		}
		else {
			remainTries--;
			System.out.println("남은 횟수 : "+remainTries);
			if(remainTries == 0) {
				System.out.println("GameOver!");
				running = false;
			}
		}
	}
	public void close() {
		// 겜임 종료 스캐너 닫기
		scanner.close();
	}
}
