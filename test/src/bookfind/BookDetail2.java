package bookfind;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

import connectdb.ConnectionTool;
import entity.Author;
import entity.Book;

public class BookDetail2 extends ActionSupport {
	private int isbn;
	private int authorId;
	private Book r1;
	private Author r2;
	public  String showDetail()
	{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		PreparedStatement ps1 = null;
		ResultSet rs1 = null;
		String sql = "select * from book where ISBN='"+isbn+"'";
		String sql1 = "select * from author where AuthorID='"+authorId+"'";
		conn = ConnectionTool.connectTheDb();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setTitle(rs.getString("title"));
				book.setIsbn(rs.getInt("isbn"));
				book.setAuthorId(rs.getInt("authorId"));
				book.setPublisher(rs.getString("publisher"));
				book.setPublishDate(rs.getString("publishDate"));
				book.setPrice(rs.getDouble("price"));
				r1=book;
			}
			ps1 = conn.prepareStatement(sql1);
			rs1 = ps1.executeQuery();
			while (rs1.next()) {
				Author author = new Author();
				author.setAge(rs1.getInt("age"));
				author.setAuthorId(rs1.getInt("authorid"));
				author.setName(rs1.getString("name"));
				author.setCountry(rs1.getString("country"));
				r2=author;
			}
			rs.close();
			ps.close();
			rs1.close();
			ps1.close();
			conn.close();
			return "finish";
		} catch (SQLException e) {
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
	public Book getR1() {
		return r1;
	}
	public void setR1(Book r1) {
		this.r1 = r1;
	}
	public Author getR2() {
		return r2;
	}
	public void setR2(Author r2) {
		this.r2 = r2;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

}
