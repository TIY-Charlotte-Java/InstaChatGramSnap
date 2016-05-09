package com.theironyard.InstaChatGramSnap.services;

import com.theironyard.InstaChatGramSnap.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);
}
