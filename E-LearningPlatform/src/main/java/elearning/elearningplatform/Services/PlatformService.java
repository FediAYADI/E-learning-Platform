package elearning.elearningplatform.Services;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Entities.User;

import java.util.List;

public interface PlatformService {
    List<Course> listcourse();
    Course Enroll(String IdCourse);
    User Register(String Pseudo, String Mdp);
    User Contact(String Name, String Email, String Message);
}
