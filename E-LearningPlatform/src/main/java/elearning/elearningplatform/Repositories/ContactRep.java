package elearning.elearningplatform.Repositories;

import elearning.elearningplatform.Entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRep extends JpaRepository<Contact,String> {
}
