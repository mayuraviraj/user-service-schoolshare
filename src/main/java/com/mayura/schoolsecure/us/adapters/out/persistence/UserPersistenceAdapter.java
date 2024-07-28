package com.mayura.schoolsecure.us.adapters.out.persistence;

import com.mayura.schoolsecure.us.application.ports.out.UserPersistencePort;
import com.mayura.schoolsecure.us.domain.models.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserPersistenceAdapter implements UserPersistencePort {

    private final UserRepository userRepository;

    public UserPersistenceAdapter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findById(String id) {
        Optional<UserJpaEntity> userEntity = userRepository.findById(id);
        return userEntity.map(this::mapToDomain);
    }

    private User mapToDomain(UserJpaEntity userJpaEntity) {
        return new User(userJpaEntity.getId(), userJpaEntity.getName(), userJpaEntity.getEmail());
    }
}
