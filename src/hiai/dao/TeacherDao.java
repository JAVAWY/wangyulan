package hiai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hiai.model.Teacher;

/*
 * ��ʦʵ��
 */
public class TeacherDao {
	public int add(Connection con, Teacher teacher)throws Exception{
		String sql="insert into teacher values(null,?,?,?,?,?,?,?,?,?)";
	PreparedStatement pstmt=con.prepareStatement(sql);
		
		pstmt.setString(1, teacher.get����());
		pstmt.setString(2,teacher.get����());
		pstmt.setString(3, teacher.get��ϵ��ʽ());
		pstmt.setString(4, teacher.get����ѧԺ());
		pstmt.setString(5, teacher.get�Ƿ�Ӵ�����());
		pstmt.setString(6, teacher.get�Ƿ�������״��());
		pstmt.setString(7, teacher.getĿǰ��ס��ַ());
		pstmt.setString(8, teacher.get�����ʱ��());
		
		return pstmt.executeUpdate();
  }
}