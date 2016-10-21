package bookfind;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectdb.ConnectionTool;
import entity.Author;
import entity.Book;
public class BookModify {
	private Book r1;
	public String Modify(){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs = null;
        PreparedStatement ps1=null;
        PreparedStatement ps2=null;
        String sql="update book set Title=?,Publisher=?,PublishDate=?,Price=? where ISBN=?";
        String sql1="select * from author where authorId=?";
        String sql2="update book set authorId=? where ISBN=?";
        conn= ConnectionTool.connectTheDb();
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,r1.getTitle());
            ps.setString(2,r1.getPublisher());
            ps.setString(3,r1.getPublishDate());
            ps.setDouble(4,r1.getPrice());
            ps.setInt(5,r1.getIsbn());
            ps.executeUpdate();
            ps1=conn.prepareStatement(sql1);
            ps1.setInt(1,r1.getAuthorId());
            System.out.println(ps1.toString());
            rs = ps1.executeQuery();
            if(rs.next())
            {
            	ps2=conn.prepareStatement(sql2);
            	ps2.setInt(1,r1.getAuthorId());
            	ps2.setInt(2,r1.getIsbn());
            	ps2.executeUpdate();
            	return "finish";
            }
            else
            	return "unfinish";
            
        } catch (SQLException e) {
            System.out.println(e);
            return "Error";
            }
	}
	public Book getR1() {
		return r1;
	}
	public void setR1(Book r1) {
		this.r1 = r1;
	}

}
