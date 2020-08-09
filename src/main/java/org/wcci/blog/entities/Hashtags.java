package org.wcci.blog.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Hashtags {
    @Id
    @GeneratedValue
    private String hashTagName;
    @ManyToMany
    private Collection<BlogPost> posts;

    protected Hashtags(){}

    public Hashtags(String hashTagName, Collection<BlogPost> posts) {
        this.hashTagName = hashTagName;
        this.posts = posts;
    }

        public String getHashTagName() {
        return hashTagName;
    }

    public Collection<BlogPost> getPosts() {
        return posts;
    }

}
