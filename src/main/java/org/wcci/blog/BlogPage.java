package org.wcci.blog;

import java.util.Collection;

public class BlogPage {

    private String name;
    private String description;
    private Collection<BlogPost> review;

    public BlogPage(String name, String description, Collection<BlogPost> review) {
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

    public Collection<BlogPost> getReview() {
        return review;
    }
}
