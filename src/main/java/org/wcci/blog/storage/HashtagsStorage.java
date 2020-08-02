package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.storage.repository.HashtagsRepository;

@Service
public class HashtagsStorage {

    HashtagsRepository hashtagsRepo;

    public HashtagsStorage(HashtagsRepository hashtagsRepo) {
        this.hashtagsRepo = hashtagsRepo;
    }

    public static Object findById(Long hashtagID) {
        return null;
    }
}
