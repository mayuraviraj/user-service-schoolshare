package com.mayura.schoolsecure.us.application.services;

import com.mayura.schoolsecure.us.application.ports.in.UserUseCase;
import com.mayura.schoolsecure.us.application.ports.out.UserPersistencePort;
import com.mayura.schoolsecure.us.domain.exceptions.UserNotFoundException;
import com.mayura.schoolsecure.us.domain.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserUseCase {

    private final UserPersistencePort userPersistencePort;

    public UserService(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public User getUserById(String id) {
        return userPersistencePort.findById(id)
                .orElseThrow(() -> new UserNotFoundException("UserDTO not found with id: " + id));
    }
}
