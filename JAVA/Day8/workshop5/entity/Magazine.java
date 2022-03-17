package workshop5.entity;

	public class Magazine extends Book {
		private String category;
		private String description;
		public Magazine(String category, int price, String title, String description) {
			super(title, price);
			this.category = category;
			this.description = description;
		}
		public String getCategory() {
			return category;
		}
		public String getDescription() {
			return description;
		}
		@Override
		public String toString() {
			return "[제목]" + super.getTitle()+ "\t[분류]" + getCategory() + "\t[가격]" + super.getPrice()
			+ "\t[비고]" + getDescription();
		}
	}
		
	

	
