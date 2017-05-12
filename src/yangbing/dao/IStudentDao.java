package yangbing.dao;

import java.util.List;
import yangbing.bean.Student;

public interface IStudentDao {
	public int insertStu(Student s);
    public int updateStu (Student s,int id) throws Exception;
    public int deleteStu(int id) throws Exception;
    public Student selectStudentById(int id) throws Exception;
    public List<Student> selectAllStudent() throws Exception;
    public List<Student> selectStudentByName(String name) throws Exception;
}
