
public class Text {
	
	private String header;
	private String text = "";
	
	public Text(Word word) {
		header = word.getWord();
	}
	
	public Text (Sentence sentence) {
		
		header = sentence.getSentence();
	}
	
	public String getHeader() {
        return header;
    }

    public void addText(Word word) {
        text = text + " " + word.getWord();
    }

    public void addText(Sentence sentence) {
    	text = text + " " + sentence.getSentence();
    }

    public String getText() {
        return text;
    }
} 
