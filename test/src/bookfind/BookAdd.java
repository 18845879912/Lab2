package bookfind;

import java.sql.Connection;
import connectdb.ConnectionTool;
//import entity.Book;
//import entity.Author;


public class BookAdd {
	private int isbn;
	private String title;
	private int authorId;
	private String publisher;
	private String publishDate;
	private Double price;
	public String ChaRu() {
		String sql="INSERT INTO book VALUES("+isbn+",'"+title+"',"+authorId+",'"+publisher+"','"+publishDate+"',"+price+")";
		Connection conn = null;
		conn = ConnectionTool.connectTheDb();
		
		try{
			java.sql.Statement s=conn.createStatement();
			s.execute(sql);
			conn.close();
			return "finish";
		}
		catch(Exception e){
			System.out.println(e);
			return "Error";
		}

	}

	public int getIsbn() {
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
}
