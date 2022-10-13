package business;

import core.Logger;
import dataAccess.StudentDao;
import entities.Student;

public class StudentManager {
	private StudentDao studentDao;
	private Logger[] loggers;
	
	public StudentManager(StudentDao studentDao, Logger[] loggers) {
		this.studentDao = studentDao;
		this.loggers = loggers;
	}

	
		
	public void add(Student student) {
		System.out.println("Ogrenci Eklendi");
		studentDao.add(student);
	
		for (Logger logger : loggers) {
			logger.log(student.getName());
		}
	}

}
