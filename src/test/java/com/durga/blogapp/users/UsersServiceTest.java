package com.durga.blogapp.users;

import com.durga.blogapp.users.dtos.CreateUserRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public class UsersServiceTest {
    @Autowired
    UsersService usersService;
    @Test
    void can_create_users(){
        var user = usersService.createUser(new CreateUserRequest(
               "John",
                "pass123",
                "john@blog.com"
        ));

        Assertions.assertNotNull(user);
        Assertions.assertEquals("john", user.getUsername());
    }
}
