package elearning.elearningplatform.Services;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Entities.User;
import elearning.elearningplatform.Repositories.AdminRep;
import elearning.elearningplatform.Repositories.ContactRep;
import elearning.elearningplatform.Repositories.CourseRep;
import elearning.elearningplatform.Repositories.UserRep;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
@Slf4j
@AllArgsConstructor
@Service
public class PlatformServiceImpl implements PlatformService{

    private AdminRep adminRep;
    private ContactRep contactRep;
    private CourseRep courseRep;

    @Override
    public List<Course> listcourse() {
        return courseRep.findAll();
    }

    @Override
    public Course Enroll(String IdCourse) {
        log.info("Good choice!");
        return null;
    }

    @Override
    public User Register(String Pseudo, String Mdp) {
        log.info("Welcome!");
        return null;
    }

    @Override
    public User Contact(String Name, String Email, String Message) {
        log.info("Thanks for messaging us!");
        return null;
    }
}
