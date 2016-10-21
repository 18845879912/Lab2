package bookfind;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connectdb.ConnectionTool;

public class Judge {
	private  int isbn;
    private String title;
    private int authorId;
    private String publisher;
    private String publishDate;
    private Double price;
	public String JudgeMent() {
		System.out.println(authorId);
		String sql="select * from author where AuthorID=?";
		Connection conn = null;
		conn = ConnectionTool.connectTheDb();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			ps = conn.prepareStatement(sql);
			//System.out.println(authorId);
			ps.setInt(1,authorId);
			rs=ps.executeQuery();
			if(rs.next())
			{
				String sql1="INSERT INTO book VALUES("+isbn+",'"+title+"',"+authorId+",'"+publisher+"','"+publishDate+"',"+price+")";
					java.sql.Statement s=conn.createStatement();
					s.execute(sql1);
					conn.close();
					return "finish";
			}
			else
				conn.close();
				return "unfinish";
		}
		catch(Exception e){
			System.out.println(e);
			return "Error";
		}
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
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
