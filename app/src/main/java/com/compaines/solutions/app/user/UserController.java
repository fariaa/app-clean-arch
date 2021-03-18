package com.compaines.solutions.app.user;

import com.compaines.solutions.adapter.user.UserAdapter;
import com.compaines.solutions.adapter.user.port.UserResponseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
public class UserController {


    com.compaines.solutions.app.user.UserRepositoryImpl repo;

    @Autowired
    public UserController(com.compaines.solutions.app.user.UserRepositoryImpl repo){
        this.repo = repo;
    }

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void userRegister(@RequestBody UserRequest request){
        UserRepository repository = new UserRepository();
        repository.save(request, repo);
    }

    @GetMapping("/user")
    public List<UserResponseImpl> teste(){
        UserRepository repository = new UserRepository();
        return repository.getAll(repo);
    }

}
