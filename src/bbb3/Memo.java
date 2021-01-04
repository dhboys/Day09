package bbb3;

public class Memo {

	// 종이의 적힐 문자
	private String text;

	public Memo(String text) {
		super();
		this.text = text;
	}
		
	// 읽기 전용
	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Memo [text=" + text + "]";
	}
	
	
	
}
