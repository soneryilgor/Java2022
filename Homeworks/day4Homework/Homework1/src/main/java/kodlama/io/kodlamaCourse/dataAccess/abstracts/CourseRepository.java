package kodlama.io.kodlamaCourse.dataAccess.abstracts;

import java.util.List;


import kodlama.io.kodlamaCourse.entities.concretes.Course;



public interface CourseRepository {
	List<Course> getAll();
	List<Course> add(Course course);
	List<Course> deleteById(int id);
	List<Course> updateById(int id, String newCourseName);
	Course findByName(String courseName);
	Course findById(int id);
}
