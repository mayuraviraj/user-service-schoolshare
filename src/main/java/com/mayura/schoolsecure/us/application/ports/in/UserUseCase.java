package com.mayura.schoolsecure.us.application.ports.in;

import com.mayura.schoolsecure.us.domain.models.User;

public interface UserUseCase {
    User getUserById(String id);
}
