package elearning.elearningplatform.Repositories;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Entities.Former;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormerRep extends JpaRepository<Former,String> {
}
