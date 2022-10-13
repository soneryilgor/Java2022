package dataAccess.jdbc;

import dataAccess.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao{
		
	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile Eklendi. " + course);
		
	}
}