package com.theironyard.InstaChatGramSnap.services;

import com.theironyard.InstaChatGramSnap.entities.Photo;
import com.theironyard.InstaChatGramSnap.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhotoRepository extends CrudRepository<Photo, Integer> {
    List<Photo> findByRecipient(User recipient);
}
