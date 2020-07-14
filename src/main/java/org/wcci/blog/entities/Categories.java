package org.wcci.blog.entities;

import org.wcci.blog.entities.BlogPost;

import java.util.Collection;

public class Categories {

    private String title;
    private String description;
    private Collection<BlogPost> posts;

    public Categories(String title, String description, Collection<BlogPost> posts) {
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
