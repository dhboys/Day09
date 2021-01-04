package bbb;

import java.util.Scanner;

public class MemoUI {

	private Scanner scanner;
	private MemoService service;

	public MemoUI(Scanner scanner, MemoService service) {
		super();
		this.scanner = scanner;
		this.service = service;
	}

	// 순서를 정해주는 메서드 ( 템플릿 메서드 )
	public void playGame() {
		inputCount();
		pickMemo();
	}

	// 외부에서 호출 못함
	private void inputCount() {
		System.out.println("How many?");
		int count = Integer.parseInt(scanner.nextLine());
		System.out.println("COUNT: " + count);
		service.readyMemo(count);

	}

	private void pickMemo() {
		while (true) {
			System.out.println("Press Enter");
			scanner.nextLine();

			// 반환값이 메모니까 메모타입으로 받는다.
			Memo memo = service.getNextMemo();

			String text = memo.getText();
			if (text.equals("X")) {
				System.out.println("당첨입니다..");
				break;
			} else  {
				System.out.println("미당첨입니다..");
			}

		}
	}
}
