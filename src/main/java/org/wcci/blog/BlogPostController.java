package org.wcci.blog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogPostController {

//    private BlogPostStorage blogPostStorage;
//    private HashtagsStorage hashtagsStorage;
//
//    public BlogPostController(BlogPostStorage blogPostStorage, HashtagsStorage hashtagsStorage) {
//        this.blogPostStorage = blogPostStorage;
//        this.hashtagsStorage = hashtagsStorage;
//    }


//    @RequestMapping("reviews/{showTitle}")
//    public String showSingleReview(@PathVariable String showTitle, Model model) {
//        model.addAttribute("reviews", reviewStorage.findReviewsByShowTitle(showTitle));
//
//        return "review-template";
//    }
//
//    @RequestMapping("hashtags/{hashtagID}")
//    public String showReviewsAssociatedWithHashtag(@PathVariable Long hashtagID, Model model) {
//        model.addAttribute("hashtag", hashtagsStorage.findById(hashtagID));
//        return "hashtags-template"; //need to make a new template and insert instead
//    }

//    this is on campuslibrarries
    private BlogPost post;
//    public BlogPostController() {
//        post = new BlogPost() {
//
//        }

    @RequestMapping("/blogPost") // this is the end point
        public String showSinglePost(Model model){
        model.addAttribute("postToDisplay", post);
        return "blogpost-template";
    }
}

