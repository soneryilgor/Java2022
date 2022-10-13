package business;

import core.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}


	public void add(Course course) throws Exception{
		
		for (Course _course : courses) {
			if(_course.getName().toLowerCase()==course.getName().toLowerCase()) {
				throw new Exception("Bu Kurs Daha Once Eklenmistir.Lutfen Baska Bir Kurs Ismi Giriniz!");
			}
		}
		
		System.out.println("Kurs Eklendi");
		courseDao.add(course);
	
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
}
