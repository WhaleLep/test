package dao;
import beans.Student;

public interface IStudentDAO {
	public abstract Student insert(Student stu) throws Exception;//添加记录的方法
	public abstract void delete(Student stu) throws Exception; //删除记录的方法
}
