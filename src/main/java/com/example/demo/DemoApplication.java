package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

import java.util.List;
import java.util.stream.Stream;

@Controller
@SpringBootApplication
public class DemoApplication {

    private final RepositoryUsers repositoryUsers;

    public DemoApplication(RepositoryUsers repositoryUsers){
        this.repositoryUsers = repositoryUsers;
    }

    @RequestMapping("/{name}")
    @ResponseBody
    String home(@PathVariable String name) {
//        repositoryUsers.save(new Users(name));
//        List<Users> all = repositoryUsers.findAll();
//        String rows = all.stream().flatMap( userName -> Stream.of(userName.getName())).toString();
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
