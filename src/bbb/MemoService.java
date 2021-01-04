package bbb;

import java.util.Arrays;

public class MemoService {

	// 의존적인 객체 혹은 데이터는 주입해서 써라 ( ex 쪽지들 -> 생성자의 의도)
	private Memo[] arr; // 쪽지 -> 공유할거라 인스턴스변수
	
	private int ord;    // 값을 누적
	
	public void readyMemo(int count) {
		// 입력받은 숫자만큼 배열을 만들어준다.

		int index = (int) (Math.random() * count);

		arr = new Memo[count];
		ord = 0;
		
		for (int i = 0; i < count; i++) {

			if (i == index) {
				arr[i] = new Memo("X");
				continue;
			} 
			arr[i] = new Memo("O");
			
		} // end for
	}

	// 파라미터 필요없다 -> 그냥 쪽지만 달라고 하면 되니까
	public Memo getNextMemo() {
		Memo result = null;
		
		System.out.println(Arrays.toString(arr));
		
		result = arr[ord];
		
		ord++;
		
		return result;
	}

}
