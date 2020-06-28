package org.wcci.blog;

import java.util.Collection;

public class Category {

    private String title;
    private String description;
    private Collection<BlogPost> posts;

    public Category(String title, String description, Collection<BlogPost> posts) {
        this.title = title;
        this.description = description;
        this.posts = posts;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Collection<BlogPost> getPosts() {
        return posts;
    }
}
