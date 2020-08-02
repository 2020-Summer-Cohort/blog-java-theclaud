package org.wcci.blog.storage;

import org.springframework.stereotype.Service;

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
