package hiai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hiai.model.StuType;

public class StuTypeDao {
	public int add (Connection con,StuType stuType) throws Exception {
		String sql="insert into student values(0,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1,stuType.get����());
		pstmt.setString(2,stuType.getѧ��());
		pstmt.setString(3,stuType.get��ϵ����());
		pstmt.setString(4,stuType.getѧԺ());
		pstmt.setString(5,stuType.get�Ƿ�Ӵ�����());
		pstmt.setString(6,stuType.get�Ƿ�������״��());
		pstmt.setString(7,stuType.get��ǰ��ס��());
		pstmt.setString(8,stuType.get������ע());
		return pstmt.executeUpdate(); 
	}
}
