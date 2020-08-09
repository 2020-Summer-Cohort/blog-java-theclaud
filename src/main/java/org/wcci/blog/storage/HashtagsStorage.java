package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.Hashtags;
import org.wcci.blog.storage.repository.HashtagsRepository;

@Service
public class HashtagsStorage {

    HashtagsRepository hashtagsRepo;

    public HashtagsStorage(HashtagsRepository hashtagsRepo) {
        this.hashtagsRepo = hashtagsRepo;
    }

    public Hashtags findHashtagsByPost(String hashtagName) {
        return hashtagsRepo.findHashtagsByPost(hashtagName);
    }

    public Iterable<Hashtags> findAllHashtags(){return hashtagsRepo.findAll();}

    public Hashtags findById(Long hashtagID) {return hashtagsRepo.findById();}
}
