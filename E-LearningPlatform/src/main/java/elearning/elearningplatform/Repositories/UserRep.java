package elearning.elearningplatform.Repositories;

import elearning.elearningplatform.Entities.Former;
import elearning.elearningplatform.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User,String> {
}
