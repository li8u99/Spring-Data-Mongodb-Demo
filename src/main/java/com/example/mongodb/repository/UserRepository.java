package com.example.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodb.model.User;
import org.springframework.data.mongodb.repository.Query;
import static java.lang.System.out;




public interface UserRepository extends MongoRepository<User, String>{


   @Query("{ 'userName' : ?#{?0}}")
   public User findByUserNameLike(String userName);


}
