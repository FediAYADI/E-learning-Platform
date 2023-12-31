package elearning.elearningplatform.Repositories;

import elearning.elearningplatform.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRep extends JpaRepository<Admin,String> {
}
