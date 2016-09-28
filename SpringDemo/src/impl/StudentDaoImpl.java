package impl;

import dao.StudentDao;
import entity.Student;

public class StudentDaoImpl implements StudentDao{
	public void add(Student stu){
		System.out.println("stu is saved");
	}
}
