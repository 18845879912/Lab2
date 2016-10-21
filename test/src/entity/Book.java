package entity;
public  class Book {
	
	private  int isbn;
    private String title;
    private int authorId;
    private String publisher;
    private String publishDate;
    private Double price;
    
	public  int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", authorId=" + authorId + ", publisher=" + publisher
				+ ", publishDate=" + publishDate + ", price=" + price + ", getIsbn()="
				+ getIsbn() + ", getTitle()=" + getTitle() + ", getAuthorId()=" + getAuthorId() + ", getPublisher()="
				+ getPublisher() + ", getPublishDate()=" + getPublishDate() + ", getPrice()=" + getPrice()
				 + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
    
    
}
