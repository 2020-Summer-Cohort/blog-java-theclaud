package org.wcci.blog;

import org.springframework.stereotype.Service;

@Service
public class BlogPostStorage {

    BlogPostRepository postRepo;
//    ReviewRepository reviewRepo;


    public BlogPostStorage(BlogPostRepository postRepo){
        this.postRepo = postRepo;
    }

//    public ReviewStorage(ReviewRepository reviewRepo) {
//        this.reviewRepo = reviewRepo;
//    }


    public BlogPost findBlogPostByPostTitle(String postTitle){
        return postRepo.findByPostTitle(postTitle);
    }
//    public Reviews findReviewsByShowTitle(String showTitle) {
//        return reviewRepo.findByShowTitle(showTitle);
//    }

    public Iterable<BlogPost>findAllPosts(){
        return postRepo.findAll();
    }
//    public Iterable<Reviews> findAllReviews() {
//        return reviewRepo.findAll();
//    }

}