package kodlama.io.kodlamaCourse.business.abstracts;

import java.util.List;

import kodlama.io.kodlamaCourse.entities.concretes.Course;

public interface CourseService {
	List<Course> getAll();
	List<Course> add(Course course) throws Exception;
	List<Course> deleteById(int id) throws Exception;
	List<Course> updateById(int id, String newCourseName) throws Exception;
	Course findByName(String courseName) throws Exception;
	Course findById(int id);
}
