package workshop5.entity;

public class Novel extends Book {
	private String author;
	
	public Novel(String title, int price, String autor) {
		super(title, price);
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	@Override
	public String toString() {
		return "[����]" + super.getTitle() + "\t[����]" + getAuthor() + "\t[����]" + super.getPrice();
	}

}
