package org.wcci.blog.storage.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.Hashtags;

import java.util.Map;

public interface HashtagsRepository extends CrudRepository<Hashtags, Long> {
    Hashtags findHashtagsByPost(String hashtagName);

    Hashtags findById();

    public Iterable<Hashtags> findAll();
}
