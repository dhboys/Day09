package bbb;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MemoService service = new MemoService();
		MemoUI ui = new MemoUI(scanner , service);
		
		ui.playGame();
	}
}
