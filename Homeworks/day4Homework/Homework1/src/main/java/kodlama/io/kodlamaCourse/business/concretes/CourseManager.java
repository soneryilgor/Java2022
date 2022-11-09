package kodlama.io.kodlamaCourse.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.kodlamaCourse.business.abstracts.CourseService;
import kodlama.io.kodlamaCourse.dataAccess.abstracts.CourseRepository;
import kodlama.io.kodlamaCourse.entities.concretes.Course;

@Service
public class CourseManager implements CourseService {

	private CourseRepository courseRepository;

	@Autowired
	public CourseManager(CourseRepository courseRepostory) {
		this.courseRepository = courseRepostory;
	}

	@Override
	public List<Course> getAll() {
		// iş kuralları
		return courseRepository.getAll();
	}

	@Override
	public List<Course> add(Course course) throws Exception {
		Course Varmi = new Course();
		Varmi = courseRepository.findByName(course.getName());
		if (Varmi == null) {
			return courseRepository.add(course);
		} else {
			throw new Exception("Aynı isimde kurs bulunmaktadır.");
		}
	}

	@Override
	public List<Course> deleteById(int id) throws Exception {
		Course Varmi = new Course();
		Varmi = courseRepository.findById(id);
		if (Varmi != null) {
			return courseRepository.deleteById(id);
		} else {
			throw new Exception(id + ": numaralı id bulunmamaktadır.");
		}
		
	}

	@Override
	public List<Course> updateById(int id, String newCourseName) throws Exception {
		Course Varmi = new Course();
		Varmi = courseRepository.findById(id);
		if (Varmi != null) {
			return courseRepository.updateById(id, newCourseName);
		} else {
			throw new Exception(id + "numaralı id bulunmamaktadır.");
		}
	}

	@Override
	public Course findByName(String courseName) throws Exception {
		return courseRepository.findByName(courseName);
	}

	@Override
	public Course findById(int id) {
		return courseRepository.findById(id);
	}

}
