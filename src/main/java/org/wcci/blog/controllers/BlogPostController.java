package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.storage.BlogPostStorage;

@Controller
public class BlogPostController {

    BlogPostStorage blogPostStorage;
    
    public BlogPostController(BlogPostStorage blogPostStorage) {
        this.blogPostStorage=blogPostStorage;

    }

     @RequestMapping("blopPost/{postTitle}")
    public String showSinglePost(@PathVariable String postTitle, Model model) {
        model.addAttribute("blogPost", blogPostStorage.findBlogPostByPostTitle(postTitle));
        return "post-template";
    }

    @RequestMapping("blogPost/{postTitle}")
    public String showAllPosts(@PathVariable String postTitle, Model model) {
        model.addAttribute("blogPost", blogPostStorage.findAllBlogPosts());
        return "post-template";
    }

}





//    public String retrievePost(Model model){
//        model.addAttribute("postToDisplay", post);
//        return "post-template";
//    }

//    private BlogPostStorage blogPostStorage;
//    private HashtagsStorage hashtagsStorage;
//
//    public BlogPostController(BlogPostStorage blogPostStorage, HashtagsStorage hashtagsStorage) {
//        this.blogPostStorage = blogPostStorage;
//        this.hashtagsStorage = hashtagsStorage;
//    }
//
//    @RequestMapping("blogPost/{postTitle")
//    public String showSinglePost(@PathVariable String postTitle, Model model) {
//        model.addAttribute("postToDisplay", blogPostStorage.findBlogPostByPostTitle(postTitle));
//        return "blogpost-template";
//    }
//
//    @RequestMapping("hashtags/{hashtagID}")
//    public String showPostWithThisHashtag(@PathVariable Long hashtagID, Model model) {
//        model.addAttribute("hashtag", HashtagsStorage.findById(hashtagID));
//        return "hashtags-template";
//    }




