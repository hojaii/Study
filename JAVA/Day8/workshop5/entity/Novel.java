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
		return "[제목]" + super.getTitle() + "\t[저자]" + getAuthor() + "\t[가격]" + super.getPrice();
	}

}
