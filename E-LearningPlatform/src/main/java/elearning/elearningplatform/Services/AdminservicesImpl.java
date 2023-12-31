package elearning.elearningplatform.Services;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Entities.Former;
import elearning.elearningplatform.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminservicesImpl implements AdminServices{
    @Override
    public List<User> listusers() {
        return null;
    }

    @Override
    public List<Course> listcourses() {
        return null;
    }

    @Override
    public List<Former> listformers() {
        return null;
    }

    @Override
    public Course CreateCourse(String IdCourse) {
        return null;
    }

    @Override
    public Course ReadCourse(String IdCourse) {
        return null;
    }

    @Override
    public Course UpdateCourse(String IdCourse) {
        return null;
    }

    @Override
    public Course DeleteCourse(String IdCourse) {
        return null;
    }
}
