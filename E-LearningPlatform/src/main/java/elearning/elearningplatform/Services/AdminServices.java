package elearning.elearningplatform.Services;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Entities.Former;
import elearning.elearningplatform.Entities.User;

import java.util.List;

public interface AdminServices {
    List<User> listusers();
    List<Course> listcourses();
    List<Former> listformers();
    Course CreateCourse(String IdCourse);
    Course ReadCourse(String IdCourse);
    Course UpdateCourse(String IdCourse);
    Course DeleteCourse(String IdCourse);
}
