package impl;

import dao.StudentDao;
import entity.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
	StudentDao stuDao = null;

	public StudentDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(StudentDao stuDao) {
		this.stuDao = stuDao;
	}
	
	public void add(Student stu){
		stuDao.add(stu);
	}
}
