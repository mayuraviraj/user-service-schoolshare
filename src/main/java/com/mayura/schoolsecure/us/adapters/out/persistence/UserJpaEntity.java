package com.mayura.schoolsecure.us.adapters.out.persistence;

import com.mayura.schoolsecure.us.shared.UserType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class UserJpaEntity {

    @Id
    private String id;
    private String name;
    private String email;
    private UserType type;
}
