package pers.zy.fasterxml.study.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.zy.fasterxml.study.dto.User;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * @param user
    {
        "user_name": "test user",
        "first_name": "test",
        "last_name": "user",
        "id": "1",
        "age": 1
    }
     */
    @PostMapping
    public void saveUser(@RequestBody User user) {
        log.info("user => {}", user);
    }

    /**
     *
     * @param id : 1
     * @return
    {
        "user_name": "test user",
        "first_name": "test",
        "last_name": "user",
        "id": "1",
        "age": 1
    }
     *
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String id) {
        return User.builder().userName("test user").firstName("test").last_name("user").ID(id).aGe(1).build();
    }

}
