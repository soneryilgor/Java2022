package dataAccess.jdbc;

import dataAccess.StudentDao;
import entities.Student;

public class JdbcStudentDao implements StudentDao{
	
	@Override
	public void add(Student student) {
		System.out.println("Jdbc ile Eklendi. " + student);
	}
}
