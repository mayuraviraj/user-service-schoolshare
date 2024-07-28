package com.mayura.schoolsecure.us.application.ports.out;

import com.mayura.schoolsecure.us.domain.models.User;

import java.util.Optional;

public interface UserPersistencePort {
    Optional<User> findById(String id);
}
