package org.wcci.blog.storage;

import org.wcci.blog.entities.Authors;

import java.util.HashMap;
import java.util.Map;

public class AuthorStorage {

    Map<String, Authors> hashtags = new HashMap<>();

    public AuthorStorage(){

    }

    public Authors findAuthorByName(String authorName){
        return null;
    }

}
