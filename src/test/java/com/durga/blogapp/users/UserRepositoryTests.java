package com.durga.blogapp.users;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTests {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    @Order(1)
    void can_create_users(){
        var user  = UserEntity.builder()
                .username("durgap")
                .email("durga@blog.com")
                .build();

        usersRepository.save(user);
    }

    @Test
    @Order(2)
    void can_find_users(){

        var user  = UserEntity.builder()
                .username("durgap")
                .email("durga@blog.com")
                .build();
        usersRepository.save(user);

        var users = usersRepository.findAll();

        assert users.size() == 1;
    }
}
