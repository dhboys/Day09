package bbb3;

import java.util.Scanner;

public class MemoUI {

	// 조력자는 인스턴스 변수
	private Scanner scanner;
	private MemoService service;

	// 생성자
	public MemoUI(Scanner scanner, MemoService service) {
		super();
		this.scanner = scanner;
		this.service = service;
	}

	// 몇 명인지 입력받기 전에 시작할 수 없도록 메서드의 순서를 정해주고
	// 외부와 소통하기 위해 public 메서드를 만든다.
	public void playGame() {
		inputCount();
		checkMemo();
	}
	// 몇 명인지 입력을 받아주는 메서드
	private void inputCount() {
		System.out.println("참가자는 몇 명인가요?");
		int count = Integer.parseInt(scanner.nextLine());
		// 입력 받은 수를 서비스에 보내주기
		service.makeBox(count);
		System.out.println("참가자수: " + count);
	}

	// 서비스에서 보낸 쪽지 확인하는 함수
	private void checkMemo() {
		// 당첨될 때까지 진행해야하므로 while
		while (true) {
			System.out.println("마음의 준비가 되면 Enter");
			scanner.nextLine();
			
			Memo memo = service.pickNextNum();
			String text = memo.getText();       // 인스턴스메서드를 호출하고 싶으면 무조건 변수를 먼저 만들고
			// 당첨이면
			if ( text.equals("X")) {
				System.out.println("당첨입니다...");
				break;
			}else {
				System.out.println("미당첨입니다...");
			}
		}  // end while
	}  // end pickNextNum

}
