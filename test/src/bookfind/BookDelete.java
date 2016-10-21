package bookfind;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connectdb.ConnectionTool;

public class BookDelete {
	private int isbn;
	private int authorId;
	
	
	public String Delete(){
		Connection conn = null;
		PreparedStatement ps = null;
		//PreparedStatement ps1 = null;
		String sql = "delete from book where ISBN=?";
		//String sql1="delete from author where Author_ID=?";
		
		conn = ConnectionTool.connectTheDb();
        try {
        	
            ps=conn.prepareStatement(sql);
            ps.setInt(1, isbn);
            ps.executeUpdate();
            //ps1=conn.prepareStatement(sql1);
            //ps1.setInt(1, authorId);
            //ps1.executeUpdate();
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


	public int getAuthorId() {
		return authorId;
	}


	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
}
