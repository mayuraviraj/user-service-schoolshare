package com.mayura.schoolsecure.us.shared.mappers;

import com.mayura.schoolsecure.us.adapters.in.rest.dto.UserDTO;
import com.mayura.schoolsecure.us.domain.models.User;

public interface UserDataMapper {

    User map(UserDTO userDTO);
}
