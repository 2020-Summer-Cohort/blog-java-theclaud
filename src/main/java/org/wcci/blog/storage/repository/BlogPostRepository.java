package org.wcci.blog.storage.repository;

import org.wcci.blog.entities.BlogPost;

import java.util.HashMap;
import java.util.Map;

public class BlogPostRepository {

        Map<String, BlogPost> posts = new HashMap<>();

//    public BlogPostStorage() {
//            posts.put(" AngelFish", new BlogPost("Angel Fish", "description", "Leia Alderran",
//                    "6/26/20",   " colorful, underwaterworld"));
//        }

        public BlogPost findByPostTitle(String postTitle){
            return posts.get(postTitle);
        }

    public Iterable<BlogPost> findAll() {
        return null;
    }
}


