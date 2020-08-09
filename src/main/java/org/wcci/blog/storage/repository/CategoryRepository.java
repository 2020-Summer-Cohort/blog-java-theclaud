package org.wcci.blog.storage.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByCategoryTitle(String categoryTitle);
}
