package bbb3;

import java.util.Arrays;

public class MemoService {

	// 원래는 makeBox안에 선언을 했으나 아래 메서드에서도 사용하므로 인스턴스 변수로 빼주었다.
	Memo[] arr;
	// 메서드 먼저 작성
	// 1. 랜덤 상자를 만들어줄 메서드
	public void makeBox(int count) {
		// 배열을 count만큼 만들어준다.
		arr = new Memo[count];
		// 0~입력한 숫자 중 랜덤한 숫자 생성
		int index = (int)(Math.random() * count );
		// for 루프
		for (int i = 0; i < count; i++) {
			if ( i == index ) {
				arr[i] = new Memo("X");
				continue;
			}else {
				arr[i] = new Memo("O");
			}
		} // end for
	}  // end makeBox
		
	// 2. 다음 번호를 뽑는 메서드
	// Memo타입으로 리턴
	public Memo pickNextNum() {
		Memo result = arr[0];
		// 맨 앞의 확인한 번호는 없어지고 배열은 하나씩 줄어든다.
		// 한 칸 적은 임시 Memo 배열을 만든다
		
		Memo[] temp = new Memo[arr.length - 1];
		// arr의 1번부터를 temp의 0번부터 temp의 길이만큼 복사
		System.arraycopy(arr, 1, temp, 0, temp.length);
		// temp를 로드,카피 arr에 스토어
		arr = temp;
		
		return result;
	}
	
	
}
