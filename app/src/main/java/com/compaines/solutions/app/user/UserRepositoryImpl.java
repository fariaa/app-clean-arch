package com.compaines.solutions.app.user;

import com.compaines.solutions.domain.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryImpl extends MongoRepository<User, String> { }
