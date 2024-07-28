package com.mayura.schoolsecure.us.shared.mappers;

import com.mayura.schoolsecure.us.adapters.in.rest.dto.UserDTO;
import com.mayura.schoolsecure.us.domain.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapperImpl implements UserDataMapper {
    @Override
    public User map(UserDTO userDTO) {
        return new User();
    }
}
