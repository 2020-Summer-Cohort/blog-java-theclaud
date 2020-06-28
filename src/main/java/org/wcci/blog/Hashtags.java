package org.wcci.blog;

import java.util.Collection;

public class Hashtags {

    private String hashTagName;
    private Collection<BlogPost> posts;

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
