package com.mayura.schoolsecure.us.adapters.in.rest;

import com.mayura.schoolsecure.us.application.ports.in.UserUseCase;
import com.mayura.schoolsecure.us.domain.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Key Endpoints:
 * POST /users - Register a new user.
 * GET /users/{id} - Retrieve user details.
 * PUT /users/{id} - Update user information.
 * DELETE /users/{id} - Delete a user.
 */
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userUseCase.getUserById(id);
    }
}
