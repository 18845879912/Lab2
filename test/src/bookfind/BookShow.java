package bookfind;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import connectdb.ConnectionTool;
import entity.Book;
//import entity.Author;
public class BookShow extends ActionSupport{
	private String name;
	private List<Book> bookList = new ArrayList<Book>();
	public  String gainBookList()
	{
		System.out.println(name);
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from book where AuthorID=any(select AuthorID from author where author.Name='"+name+"')";
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
				bookList.add(book);
			}
			rs.close();
			ps.close();
			conn.close();
			return "finish";
		} catch (Exception e) {
			return "Error";
		}
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
  
	
	

	
	
	
	

}
