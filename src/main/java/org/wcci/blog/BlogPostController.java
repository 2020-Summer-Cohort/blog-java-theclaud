package org.wcci.blog;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BlogPostController {

    Map<String, BlogPost> posts = new HashMap<>();

    public BlogPostController() {
        posts.put(" AngelFish", new BlogPost("Angel Fish", "description", "Leia Alderran", "6/26/20",  Hashtags));
    }

    @RequestMapping ("posts/{postTitle}"){
        public String showSinglePost(@PathVariable String postTitle, Model model){
            model.addAttribute("postToDisplay", posts.get(postTitle));
            return "blogpost-template";
        }
    }
}



   // @RequestMapping("posts/{postTitle") // this is the end point
    //public String showSinglePost(@PathVariable String postTitle, Model model){
     //   model.addAttribute("posts", BlogPostStorage.findBlogPostByPostTitle(postTitle));
      //  return "blogpost-template";
    //}
   // @RequestMapping("hashtags/{hashtagID}")
    //public String showPostWithThisHashtag(@PathVariable Long hashtagID, Model model) {
      //  model.addAttribute("hashtag", HashtagsStorage.findById(hashtagID));
        //return "hashtags-template";
    //}




