package org.wcci.blog.storage;

import org.wcci.blog.entities.Category;

import java.util.HashMap;
import java.util.Map;

public class CategoryStorage {

    private Map<String, Category> categories = new HashMap<>();
        categories.put("Top Dwelling Fish", new Category("Top Dwellers", "desc",null));



}
