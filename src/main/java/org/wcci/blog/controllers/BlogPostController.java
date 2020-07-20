package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.storage.BlogPostStorage;
import org.wcci.blog.storage.HashtagsStorage;

@Controller
public class BlogPostController {

    private BlogPostStorage blogPostStorage;
    private HashtagsStorage hashtagsStorage;

    public BlogPostController(BlogPostStorage blogPostStorage, HashtagsStorage hashtagsStorage) {
        this.blogPostStorage = blogPostStorage;
        this.hashtagsStorage = hashtagsStorage;
    }

    @RequestMapping("blogPost/{postTitle")
    public String showSinglePost(@PathVariable String postTitle, Model model) {
        model.addAttribute("postToDisplay", blogPostStorage.findBlogPostByPostTitle(postTitle));
        return "blogpost-template";
    }

    @RequestMapping("hashtags/{hashtagID}")
    public String showPostWithThisHashtag(@PathVariable Long hashtagID, Model model) {
        model.addAttribute("hashtag", HashtagsStorage.findById(hashtagID));
        return "hashtags-template";
    }
}



