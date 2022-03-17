package workshop5.entity;

	public class Book {
		private String title;
		private int price;
		public Book(String title, int price) {
			super();
			this.title = title;
			this.price = price;
		}
		public String getTitle() {
			return title;
		}
		public int getPrice() {
			return price;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "[제목]"+ getTitle() + "\t[가격]" + getPrice();
		}
	}
		
		
	
