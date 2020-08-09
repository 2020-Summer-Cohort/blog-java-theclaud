package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.Authors;
import org.wcci.blog.storage.repository.AuthorsRepository;

@Service
public class AuthorsStorage {

    AuthorsRepository authorsRepo;

    public AuthorsStorage(AuthorsRepository authorsRepo){
        this.authorsRepo = authorsRepo;
    }

    public Authors findAuthorByName(String authorName){
        return authorsRepo.findByName(authorName);
    }

}
