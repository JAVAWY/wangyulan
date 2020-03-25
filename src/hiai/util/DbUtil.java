package hiai.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 连接数据库类
 * @author wang
 *
 */
public class DbUtil {
	
	private String dbUrl="jdbc:mysql://localhost:3306/my demo";//数据库的连接地址
	private String dbUserName="root";//数据库用户名
	private String dbPassWord="root";//数据库密码
	private String jdbcName="com.mysql.jdbc.Driver";//驱动名称
	
	//数据库连接
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassWord);
		return con;
	}
	//数据库关闭
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	//测试数据库是否连接
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
