package org.wcci.blog;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class BlogPost {

    private String postTitle;
    private String postDescription;
    private String author;
    private String postDate;
    private Collection<Hashtags> hashtags;

    protected BlogPost(){

    }

    public BlogPost(String postTitle, String postDescription, String author, String postDate, Hashtags...hashtags) {
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.author = author;
        this.postDate = postDate;
        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }


    public String getPostTitle() {
        return postTitle;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostDate() {
        return postDate;
    }

    public Collection<Hashtags> getHashtags() { return hashtags;}
}
