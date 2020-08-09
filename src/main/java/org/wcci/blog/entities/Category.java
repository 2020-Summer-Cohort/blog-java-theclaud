package org.wcci.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private String title;
    private String description;
    @OneToMany
    private Collection<BlogPost> posts;

    protected Category(){}

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
