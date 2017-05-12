package yangbing.test;


import java.util.List;

import yangbing.bean.Student;
import yangbing.dao.IStudentDao;
import yangbing.dao.imp.IStudentDaoImp;

public class test {

	public static void main(String[] args) throws Exception {
		IStudentDao dao = new IStudentDaoImp();
		Student student = new Student("杨兵", 22, 100);
		//System.out.println(dao.insertStu(student));
		List<Student> s = dao.selectAllStudent();
		for(int i = 0 ; i < s.size() ; i++)
		{
			System.out.println(s.get(i));
		}
	}
}
