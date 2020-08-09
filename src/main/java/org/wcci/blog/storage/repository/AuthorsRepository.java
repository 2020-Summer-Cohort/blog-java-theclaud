package org.wcci.blog.storage.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.Authors;

public interface AuthorsRepository extends CrudRepository<Authors, Long> {
    Authors findByName(String authorName);
}
