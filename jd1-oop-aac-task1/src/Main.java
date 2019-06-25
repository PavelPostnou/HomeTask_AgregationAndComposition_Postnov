
public class Main {

	public static void main(String[] args) {

		 Word word = new Word("Work");
	     Text text = new Text(word);

	     Word word1 = new Word("My ");
	     Word word2 = new Word("work ");
	     Word word3 = new Word("is ");
	     Word word4 = new Word("done ");

	     Sentence sentence = new Sentence();
	     sentence.addWord(word1);
	     sentence.addWord(word2);
	     sentence.addWord(word3);
	     sentence.addWord(word4);

	     text.addText(sentence);

	     System.out.println("Head: "+text.getHeader());
	     System.out.println("Text: "+text.getText());

	}

}
