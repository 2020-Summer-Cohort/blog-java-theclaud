package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.entities.BlogPost;
import org.wcci.blog.entities.Hashtags;
import org.wcci.blog.storage.BlogPostStorage;
import org.wcci.blog.storage.HashtagsStorage;

@Controller
public class BlogPostController {

    BlogPost post;
    public BlogPostController(){
        post = new BlogPost("Angel Fish", "Angel Fish are graceful when they're swimming around.I enjoy watching them move around and show off their fins,\n" +
                " the way they flow with the water is magical to see. The Angel fish grows to be 8 inches big and they vary in pattern\n" +
                " The Marbled Angel has a mix of black,blue and gray. A classic must have for your growing aquarium.", "Leia Alderran", "6/26/20", <Hashtags> );
    }

    public String retrievePost(Model model){
        model.addAttribute("postToDisplay", post);
        return "post-template";
    }

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
}



