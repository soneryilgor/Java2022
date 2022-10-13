package dataAccess.hibernate;

import dataAccess.StudentDao;
import entities.Student;

public class HibernateStudentDao implements StudentDao{
	
	@Override
	public void add(Student student) {
		System.out.println("Hibernate ile Eklendi. " + student);
	}
	
}
