package elearning.elearningplatform.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    private String IdCourse;
    private String Title;
    private String Description;
    @ManyToOne
    private User user;
    @ManyToOne
    private Former idformer;
}
