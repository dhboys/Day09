package bbb;


public class Memo {
	
	private String text;

	public Memo(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return "Memo [text=" + text + "]";
	}
	

}
