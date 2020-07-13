package org.wcci.blog;

import org.springframework.stereotype.Service;


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