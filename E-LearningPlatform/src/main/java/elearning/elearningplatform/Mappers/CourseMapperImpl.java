package elearning.elearningplatform.Mappers;

import elearning.elearningplatform.Dtos.UserDTO;
import elearning.elearningplatform.Entities.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CourseMapperImpl {
    public UserDTO userDTO(User user){
        UserDTO userDTO=new UserDTO();
        BeanUtils.copyProperties(user,userDTO);
        return null;
    }

    public User UserDTO(UserDTO userDTO){
        return null;
    }
}
