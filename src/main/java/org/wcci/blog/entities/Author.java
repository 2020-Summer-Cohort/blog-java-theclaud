package org.wcci.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private String firstName;
    private String lastName;
    private Collection<BlogPost> posts;

    protected  Author(){}

    public Author(String firstName, String lastName, Collection<BlogPost> posts) {
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
