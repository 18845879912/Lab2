package bookfind;

import java.sql.Connection;

import connectdb.ConnectionTool;

public class AuthorAdd {
	private int authorId;
	private String name;
	private int age;
	private String country;
	public String ChaRu() {
		String sql1="insert into author values("+authorId+",'"+name+"',"+age+",'"+country+"')";
		Connection conn = null;
		conn = ConnectionTool.connectTheDb();
		try{
			java.sql.Statement s=conn.createStatement();
			s.execute(sql1);
			conn.close();
			return "finish";
		}
		catch(Exception e){
			return "Error";
		}
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
