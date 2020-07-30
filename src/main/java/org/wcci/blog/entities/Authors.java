package org.wcci.blog.entities;


import java.util.Collection;


public class Authors {


    private String firstName;
    private String lastName;
    private Collection<BlogPost> posts;

    protected Authors(){}

    public Authors(String firstName, String lastName, Collection<BlogPost> posts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.posts = posts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Collection<BlogPost> getPosts() {
        return posts;
    }
}
