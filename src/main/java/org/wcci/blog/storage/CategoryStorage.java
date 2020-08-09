package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.entities.Category;
import org.wcci.blog.storage.repository.CategoryRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CategoryStorage {

    CategoryRepository categoryRepo;

    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public Category findCategoryByTitle(String categoryTitle) {
        return categoryRepo.findByCategoryTitle(categoryTitle);
    }

    public Iterable<Category> findAllCategories() {
        return categoryRepo.findAll();
    }
}
