package elearning.elearningplatform.Repositories;

import elearning.elearningplatform.Entities.Admin;
import elearning.elearningplatform.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRep extends JpaRepository<Course,String> {
}
