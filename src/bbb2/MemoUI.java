package bbb2;

import java.util.Scanner;

public class MemoUI {

	// 스캐너 사용
	private Scanner scanner;
	private MemoService service;

	// 한 번에 실행해주고 외부와 소통하는 함수
	public void playGame() {
		inputCount();
		pickNextNum();
	}

	public MemoUI(Scanner scanner, MemoService service) {
		super();
		this.scanner = scanner;
		this.service = service;
	}

	// 숫자를 입력받는다.
	private void inputCount() {
		System.out.println("How many?");
		int count = Integer.parseInt(scanner.nextLine());
		System.out.println("COUNT: " + count);

		service.makeMemo(count);

	}

	// 엔터를 입력받고 결과를 보여주는 함수
	private void pickNextNum() {

		while (true) {
		Memo memo = service.getNextMemo();

		String text = memo.getText();
		// 당첨까지 계속 받아야하니까 while
			System.out.println("Press Enter");
			scanner.nextLine();

			if (text.equals("X")) {
				System.out.println("당첨입니다...");
				break;
			} else {
				System.out.println("미당첨입니다...");
			}
		} // end while
	}
}
