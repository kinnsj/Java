package application;

import java.util.Random;

public class Randomword {

	private String books = "accident requirement responsibility addition development database appointment profession software obligation assignment presentation recommendation internet presence response reputation government grandmother pollution indication construction intention permission celebration temperature employer signature preference atmosphere";
	private String[] words = books.split(" ");
	private Random random = new Random();
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters;

	// 생성자로 생성시 단어가 선택됨
	public Randomword() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];

	}

	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		}
		// System.out.println(words[0]);
		// System.out.println(words[1]);
		// System.out.println(words[2]);
	}

	public String toString() {
		String text = "";
		// 단어를 맞추었을때
		// characters[3] = 'X';
		// 삼항 연산자
		for (char c : characters) {
//			if (c == '\u0000') { // 처음상태 공백
//				text += '_';
//			} else { // 문자를 맞췄을떄
//				text += c;
//			}
			text += ' ';
			text += (c == '\u0000') ? '_' : c;
		}
		System.out.println(selectWord);// *임시로 단어를 보여줌*
		return text;
	}

	// 입력된 문자와 같은 문자가 있는지 확인
	public boolean addGuess(char c) {
		boolean ok = false;
		// 랜덤으로 서낵한 단어에 c 문자가 있으면
		// 그 문자를 charaters의 인데그 위치에 입력
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
				ok = true;
			}
		}

		return ok ? true : false;
	}

	public boolean isComplete() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false; // 아직 문자가 남았음
			}
		}
		return true; // 다 맞춤
	}
}