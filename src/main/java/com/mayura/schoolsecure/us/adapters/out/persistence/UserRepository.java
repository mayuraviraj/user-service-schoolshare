package com.mayura.schoolsecure.us.adapters.out.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@   Repository
public interface UserRepository extends MongoRepository<UserJpaEntity, String> {
}
