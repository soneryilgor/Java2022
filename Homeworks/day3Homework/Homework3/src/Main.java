import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import business.StudentManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import dataAccess.hibernate.HibernateStudentDao;
import dataAccess.jdbc.JdbcCategoryDao;
import dataAccess.jdbc.JdbcCourseDao;
import dataAccess.jdbc.JdbcInstructorDao;
import dataAccess.jdbc.JdbcStudentDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import entities.Student;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger(),new DatabaseLogger(), new MailLogger()};
		
		
		Student student1= new Student();
		student1.setName("Soner");
		student1.setLastName("Yilgor");
		student1.setId(1);
		student1.setStudentNumber(1);
		
		StudentManager studentManager1 = new StudentManager(new HibernateStudentDao(), loggers);
		StudentManager studentManager2 = new StudentManager(new JdbcStudentDao(), loggers);
		studentManager1.add(student1);
		studentManager2.add(student1);
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setLastname("Demirog");
		instructor1.setId(2);
		instructor1.setInstructorNumber(1);
		
		InstructorManager instructorManager1 = new InstructorManager(new HibernateInstructorDao(), loggers);
		InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager1.add(instructor1);
		instructorManager2.add(instructor1);
		
		
		Category category1 = new Category();
		category1.setName("Yazilim");
		category1.setInfo("Yazilim Kategorisi");
		category1.setId(4);
		category1.setCategoryNumber(1);
		
		
		CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers);
		CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager1.add(category1);
		categoryManager2.add(category1);
		
		Course course1 = new Course();
		course1.setName("Java Egitimi");
		course1.setInfo("Java developer kursu");
		course1.setId(3);
		course1.setCourseNumber(1);
		course1.setInstructor(instructor1);
		course1.setUnitPrice(10);
		course1.setCategory(category1);
		
		
		CourseManager courseManager1 =new CourseManager(new HibernateCourseDao(), loggers);
		CourseManager courseManager2 =new CourseManager(new JdbcCourseDao(), loggers);
		courseManager1.add(course1);
		courseManager2.add(course1);
	}

}
