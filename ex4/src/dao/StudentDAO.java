package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import beans.DbConnect;
import beans.Student;

public class StudentDAO {
	protected static String INSERT_SQL="insert into stu_info (id,name,sex,age,weight,height) values (?,?,?,?,?,?)";
	protected static String DELETE_SQL ="delete from stu_info where id=?";
	
	public Student insert(Student stu) throws Exception {
		Connection con=null;
	    PreparedStatement prepStmt=null;
	    ResultSet rs=null;
	    try{
	    	con=DbConnect.getDBconnection();
	    	prepStmt =con.prepareStatement(INSERT_SQL); 
	    	prepStmt.setInt(1,stu.getId());
	    	prepStmt.setString(2,stu.getName());
	    	prepStmt.setString(3,stu.getSex());
	    	prepStmt.setInt(4,stu.getAge());
	    	prepStmt.setFloat(5,stu.getWeight());
	    	prepStmt.setFloat(6,stu.getHeight());
	    	prepStmt.executeUpdate();
	    }catch(Exception e){
	    }finally{
	    	DbConnect.closeDB(con, prepStmt, rs);
	    }
	    return stu;
	}
	
	public void delete(Student stu) throws Exception {
		Connection con=null;
	    PreparedStatement prepStmt=null;
	    ResultSet rs=null;
	    try {
	    	con=DbConnect.getDBconnection();
	    	prepStmt = con.prepareStatement(DELETE_SQL);
	        prepStmt.setInt(1,stu.getId());
	        prepStmt.executeUpdate();
	    }catch(Exception e) {
	    } finally{
	    	 DbConnect.closeDB(con, prepStmt, rs);
	    }
	}
}
