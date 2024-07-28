package com.mayura.schoolsecure.us.adapters.in.rest.dto;

import com.mayura.schoolsecure.us.shared.UserType;
import lombok.Data;

@Data
public class UserDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private UserType userType;
}
