package elearning.elearningplatform.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Former {
    @Id
    private String IdFormer;
    private String FullName;
    private String Grade;
    @OneToMany(mappedBy = "idformer")
    private List<Course> courses;
}
