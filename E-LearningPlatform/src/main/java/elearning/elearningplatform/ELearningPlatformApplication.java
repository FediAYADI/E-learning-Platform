package elearning.elearningplatform;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Entities.User;
import elearning.elearningplatform.Repositories.AdminRep;
import elearning.elearningplatform.Repositories.CourseRep;
import elearning.elearningplatform.Repositories.FormerRep;
import elearning.elearningplatform.Repositories.UserRep;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.PseudoColumnUsage;
import java.util.stream.Stream;

@SpringBootApplication
public class ELearningPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(ELearningPlatformApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AdminRep adminRep, CourseRep courseRep, FormerRep formerRep, UserRep userRep){
        return args -> {

            Stream.of("Mohamed","Anouar","Fedi").forEach(pseudo->{
                User user = new User();
                user.setPseudo(pseudo);
                user.setMdp(pseudo+"123");
                userRep.save(user);
            });

            userRep.findAll().forEach(user -> {
                Course course=new Course();
                course.setIdCourse("Ang01");
                course.setTitle("Learn Angular");
                course.setDescription("anglular course");
                courseRep.save(course);
            });

        };
    }

}
