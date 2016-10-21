package connectdb;
import java.sql.*;  
public class ConnectionTool  {   
    private static String DBDRIVER   = "com.mysql.jdbc.Driver";                                      
    private static String DBURL      = "jdbc:mysql://ahrpkhmblvym.rds.sae.sina.com.cn:10054/bookdb?useUnicode=true&character=UTF-8";               
    private static String DBUSER     = "root";  
    private static String DBPASSWORD = "123456";  
    public static Connection connectTheDb(){
    	try{
    		Class.forName(DBDRIVER);//1.加载驱动  
            Connection conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);//2.获得链接
            return conn;
    	}catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    	
    }
}  