package org.wcci.blog.storage.repository;

import org.springframework.data.repository.CrudRepository;
import org.wcci.blog.entities.BlogPost;
import java.util.HashMap;
import java.util.Map;

public class BlogPostRepository extends CrudRepository<BlogPost, Long> {

//        Map<String, BlogPost> posts = new HashMap<>();
//
//        public BlogPost findByPostTitle(String postTitle){
//            return posts.get(postTitle);
//        }
//
//    public Iterable<BlogPost> findAll() {
//        return null;
//    }
}


