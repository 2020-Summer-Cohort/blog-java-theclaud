package org.wcci.blog.storage;

import org.wcci.blog.entities.Category;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CategoryStorage {

    private Map<String, Category> categories = new HashMap<>();

    public CategoryStorage(){
       categories.put("Top Dwelling Fish", new Category("Top Dwellers", "desc",null);
    }

    public Object findCategoryByTitle(String categoryTitle) {
        return categories.get(categoryTitle);
    }

    public Collection<Category> findAllCategories() {
        return categories.values();
    }
}
