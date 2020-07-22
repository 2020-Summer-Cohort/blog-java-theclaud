package org.wcci.blog.entities;


import java.util.Collection;


public class Author {


    private String authorName;
    private Collection<BlogPost> posts;

    protected  Author(){}

    public Author(String firstName, String lastName, Collection<BlogPost> posts) {
        this.authorName = firstName;
        this.posts = posts;
    }

    public String getFirstName() {
        return authorName;
    }

    public Collection<BlogPost> getPosts() {
        return posts;
    }
}
