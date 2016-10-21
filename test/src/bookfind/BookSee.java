package bookfind;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import connectdb.ConnectionTool;
import entity.Book;
import entity.Author;

public class BookSee extends ActionSupport {
	private List<Book> bookList1 = new ArrayList<Book>();
	private List<Author> authorList = new ArrayList<Author>();
	public  String gainBookList()
	{
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		String sql = "select * from book";
		String sql1="select * from author";
		
		conn = ConnectionTool.connectTheDb();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ps1 = conn.prepareStatement(sql1);
			rs1 = ps1.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setTitle(rs.getString("title"));
				book.setIsbn(rs.getInt("isbn"));
				book.setAuthorId(rs.getInt("authorId"));
				book.setPublisher(rs.getString("publisher"));
				book.setPublishDate(rs.getString("publishDate"));
				book.setPrice(rs.getDouble("price"));
				bookList1.add(book);
			
			}
			while(rs1.next()){
				Author author = new Author();
				author.setAge(rs1.getInt("age"));
				author.setName(rs1.getString("name"));
				author.setCountry(rs1.getString("country"));
				authorList.add(author);
			}
			rs.close();
			ps.close();
			rs1.close();
			ps1.close();
			conn.close();
			return "finish";
		} catch (SQLException e) {
			return "Error";
		}
}
	public List<Author> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}
	public List<Book> getBookList1() {
		return bookList1;
	}
	public void setBookList1(List<Book> bookList1) {
		this.bookList1 = bookList1;
	}
}
