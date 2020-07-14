package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.storage.repository.BlogPostRepository;
import org.wcci.blog.entities.BlogPost;


@Service
public class BlogPostStorage {

    BlogPostRepository postRepo;

    public BlogPostStorage(BlogPostRepository postRepo) {
        this.postRepo = postRepo;
    }

    public BlogPost findBlogPostByPostTitle(String postTitle){
        return postRepo.findByPostTitle(postTitle);
    }

    public Iterable<BlogPost> findAllPosts() {
        return postRepo.findAll();
    }


}