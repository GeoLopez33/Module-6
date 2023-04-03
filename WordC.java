package application;

public class WordC {
	

	String word;
	int count;
	
	public WordC(String word) {
		this.word=word;
		count=1;
	}
	
	public WordC(String word, int num) {
		this.word=word;
		count=num;
	}
	
	public void getCountS() {
		
		System.out.println(word + ": " + count);
	}
	
public String getCountSS() {
		
		return (word + ": " + count);
	}
	
	
	public int getCount() {
		
		return count;
	}
	
	public void upCount() {
		count++;
	}
	
	@Override
	public String toString() {

		return word;
	}
	
	public void setZero() {
		count=0;
	}
}
