package org.wcci.blog;


import java.util.Collection;

public class BlogPost {

    private String title;
    private String description;
    private String author;
    private String postedDate;
    private Collection<Hashtags> hashtags;

    protected BlogPost(){

    }

    public BlogPost(String title, String description, String author, String postedDate, Collection<Hashtags> hashtags) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.postedDate = postedDate;
        this.hashtags = hashtags;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public Collection<Hashtags> getHashtags() { return hashtags;}
}
