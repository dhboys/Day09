package bbb3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 주입된 변수
		Scanner scanner = new Scanner(System.in);
		MemoService service = new MemoService();
		
		MemoUI ui = new MemoUI( scanner , service );
		
		ui.playGame();
	}
}
