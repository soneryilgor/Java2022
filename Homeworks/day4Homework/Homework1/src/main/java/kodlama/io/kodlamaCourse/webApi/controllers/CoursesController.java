package kodlama.io.kodlamaCourse.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlamaCourse.business.abstracts.CourseService;
import kodlama.io.kodlamaCourse.entities.concretes.Course;

@RestController // annotation
@RequestMapping("/api/courses")
public class CoursesController {
	private CourseService courseService;
	
	@Autowired
	public CoursesController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@GetMapping("/getall")
	public List<Course> getAll(){
		return courseService.getAll();
	}
	
	@PostMapping("/add")
	public List<Course> add(Course course) throws Exception{
		return courseService.add(course);
	}
	
	@PostMapping("/deletebyid")
	public List<Course> deleteById(int id) throws Exception{
		return courseService.deleteById(id);
	}
	
	@PostMapping("/updatebyname")
	public List<Course> updateById(int id, String newCourseName) throws Exception{
		return courseService.updateById(id, newCourseName);
	}
	
	@PostMapping("/findbyid")
	public Course findById(int id){
		return courseService.findById(id);
	}
	
	@PostMapping("/findbyname")
	public Course findByName(String courseName) throws Exception{
		return courseService.findByName(courseName);
	}
	
}
