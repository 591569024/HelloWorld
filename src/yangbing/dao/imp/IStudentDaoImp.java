package yangbing.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import yangbing.bean.Student;
import yangbing.dao.IStudentDao;
import yangbing.dao.tools.DBTools;

public class IStudentDaoImp implements IStudentDao {
	SqlSession session = DBTools.getSession();
	IStudentDao mapper = session.getMapper(IStudentDao.class);
	@Override
	public int insertStu(Student s) {
		try
		{
			mapper.insertStu(s);
			session.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
//		}finally {
//			if(session!=null)
//				session.close();
//		}
		return s.getId();
	}

	@Override
	public int updateStu(Student s, int id) throws Exception {
		try
		{
			mapper.updateStu(s, id);
			session.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		return s.getId();
		
	}

	@Override
	public int deleteStu(int id) throws Exception {
		try
		{
			mapper.deleteStu(id);
			session.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		return id;	
	}

	@Override
	public Student selectStudentById(int id) throws Exception {
		Student s = new Student();
		try
		{
			s = mapper.selectStudentById(id);
			session.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		return s;
	}

	@Override
	public List<Student> selectAllStudent() throws Exception {
		List<Student> s = new ArrayList<Student>();
		try
		{
			s = mapper.selectAllStudent();
			session.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		return s;
	}

	@Override
	public List<Student> selectStudentByName(String name) throws Exception {
		List<Student> s = new ArrayList<Student>();
		try
		{
			s = mapper.selectStudentByName(name);
			session.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			session.rollback();
		}
		return s;
	}

}
