import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        // This will be returned when we hit the URL http://localhost:8080/home
        return "Hello World this is home page";
    }

    //get the courses
    @GetMapping("/courses")
    public List<Courses> getCourses() {
        return this.courseService.getCourses();
    }

    //get single course
    @GetMapping("/courses/{courseId}")
    public Courses getCourse(long courseId) {
        return this.courseService.getCourse(courseId);
    }

    //add course
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses courses){
        return this.courseService.addCourse(courses);
    }

    //update course
    @PutMapping("/courses")
    public Courses updateCourse(Courses courses) {
        return this.courseService.updateCourse(courses);
    }

    //delete course
    @DeleteMapping("/courses/{courseId}")
    public Courses deleteCourse(long courseId) {
        return this.courseService.deleteCourse(courseId);
    }
}
