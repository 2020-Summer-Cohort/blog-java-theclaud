package org.wcci.blog;

import java.util.Collection;

public class Author {

    private String firstName;
    private String lastName;
    private Collection<BlogPost> reviews;

    public Author(String firstName, String lastName, Collection<BlogPost> reviews) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reviews = reviews;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Collection<BlogPost> getReviews() {
        return reviews;
    }
}
