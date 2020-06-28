package org.wcci.blog;


public class Reviews {

    private String title;
    private String description;
    private String author;
    private String postedDate;
    private String hashtags;

    public Reviews(String title, String description, String author, String postedDate, String hashtags) {
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

    public String getHashtags() {
        return hashtags;
    }
}
