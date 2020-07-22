package org.wcci.blog.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class BlogPost {


    private String postTitle;
    private String postContent;
    private String author;
    private String postDate;
    private Collection<Hashtags> hashtags;


    protected BlogPost(){

    }

    public BlogPost(String postTitle, String postContent, String author, String postDate, Collection<Hashtags> hashtags) {
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.author = author;
        this.postDate = postDate;
        this.hashtags = hashtags;
//        this.hashtags = new ArrayList<>(Arrays.asList(hashtags));
    }


    public String getPostTitle() {
        return postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostDate() {
        return postDate;
    }

    public Collection<Hashtags> getHashtags() { return hashtags; }



}
