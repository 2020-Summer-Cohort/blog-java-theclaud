package org.wcci.blog.storage;

import org.wcci.blog.entities.Authors;

import java.util.HashMap;
import java.util.Map;

public class AuthorsStorage {

    Map<String, Authors> hashtags = new HashMap<>();

    public AuthorsStorage(){

    }

    public Authors findAuthorByName(String authorName){
        return null;
    }

}
