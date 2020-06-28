package org.wcci.blog;

import java.util.Collection;

public class Categories {

    private String name;
    private String description;
    private Collection<Reviews> review;

    public Categories(String name, String description, Collection<Reviews> review) {
        this.name = name;
        this.description = description;
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Reviews> getReview() {
        return review;
    }
}
