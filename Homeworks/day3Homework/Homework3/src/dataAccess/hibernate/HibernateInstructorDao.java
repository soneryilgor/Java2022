package dataAccess.hibernate;

import dataAccess.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile Eklendi. " + instructor);
	}
	
}
