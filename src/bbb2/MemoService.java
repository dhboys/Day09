package bbb2;

import java.util.Arrays;

public class MemoService {

	// arr이 모든 메소드에 쓰이므로 인스턴스 변수로 빼준다.
	private Memo[] arr;
	// 함수를 먼저 만들어준다
	private int ord;
	// 1. 입력된 숫자만큼 뽑기 종이를 만드는 함수
	public void makeMemo(int count) {
		arr = new Memo[count];
		// 랜덤한 숫자를 생성해서 복불복 종이를 만든다
		int index = (int) (Math.random() * count);
		// 각 배열에 종이를 채워넣는다.
		ord = 0;
		for (int i = 0; i < count; i++) {
			if (i == index) {
				arr[i] = new Memo("X");
				continue;
			}
			arr[i] = new Memo("O");
		} // end for
	}

	// 2. 종이를 주는 함수
	public Memo getNextMemo() {
		Memo result = null;

		System.out.println(Arrays.toString(arr));
		
		result = arr[ord];
		
		ord++;
		
		return result;
	}

}
