package elearning.elearningplatform.Dtos;

import elearning.elearningplatform.Entities.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;



@Data

public class UserDTO {
    private String Pseudo;
    private String Mdp;
}
