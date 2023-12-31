package elearning.elearningplatform.Web;

import elearning.elearningplatform.Entities.Course;
import elearning.elearningplatform.Services.PlatformService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j

public class UserRestController {
    private PlatformService platformService;

    public List<Course> users(){
        return platformService.listcourse();
    }

}
