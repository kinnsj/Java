package test;

import java.util.Random;

// 테스트 패키지에서 테스트 하기
public class randomTest {
	public static void main(String[] args) {
		// 테스트용 클래스
		//Random randomWord = new Random();
		//System.out.println(randomWord.toString());
		
		//랜덤으로 한 단어를 가져오기
		Random random = new Random();
		String[] words = { "펭수", "고양이", "라이언", "늑대", "소" };
//		int randomIndex = random.nextInt(5);
//		System.out.println(words[randomIndex]);
		for (int i = 0; i < 100; i++) {
			int randomIndex = random.nextInt(words.length);
			System.out.print(words[randomIndex]);
			System.out.print(" ");
		}
	}
}
