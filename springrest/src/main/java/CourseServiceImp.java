import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService{

    List<Courses> list;

    public CourseServiceImp() {
        list = new ArrayList<>();
        list.add(new Courses(1, "Java", "Java Course"));
        list.add(new Courses(2, "Spring Boot", "Spring Boot Course"));
        list.add(new Courses(3, "Python", "Python Course"));
        list.add(new Courses(4, "Django", "Django Course"));
        list.add(new Courses(5, "C++", "C++ Course"));
    }

    @Override
    public List<Courses> getCourses() {
        return list;
    }

    @Override
    public Courses getCourse(long courseId) {
        Courses c = null;
        for(Courses course : list) {
            if(course.getId() == courseId) {
                c = course;
                break;
            }
        }
        return c;
    }

    @Override
    public Courses  addCourse(Courses courses) {
        list.add(courses);
        return courses;
    }

    @Override
    public Courses updateCourse(Courses courses) {
        list.forEach(e -> {
            if(e.getId() == courses.getId()) {
                e.setTitle(courses.getTitle());
                e.setDescription(courses.getDescription());
            }
        });
        return courses;
    }

    @Override
    public Courses deleteCourse(long courseId) {
        Courses c = null;
        for(Courses course : list) {
            if(course.getId() == courseId) {
                c = course;
                list.remove(course);
                break;
            }
        }
        return c;
    }
}
