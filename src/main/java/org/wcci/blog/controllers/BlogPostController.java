package org.wcci.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wcci.blog.entities.BlogPost;
import org.wcci.blog.entities.Hashtags;


import java.util.HashMap;
import java.util.Map;

@Controller
public class BlogPostController {

    Map<String, BlogPost> posts = new HashMap<>();

    
    public BlogPostController(){
        posts.put("Angel Fish", new BlogPost("Angel Fish", "Angel Fish are graceful when they're swimming around.I enjoy watching\n" +
                " them move around and show off their fins, the way they flow with the\n" +
                " water is magical to see. The Angel fish grows to be 8 inches big and\n" +
                " they vary in pattern The Marbled Angel has a mix of black,blue and\n" +
                " gray. A classic must have for your growing aquarium.", "Leia Alderran", "06/26/20", Collection<Hashtags>hashtags));

        posts.put("Kamaka Fish", new BlogPost("Kamaka Fish", "The Kamaka Rainbow fish are known for their impeccable, colorful\n" +
                " pattern on it's scales. With many hints of blue, from sky blue to\n" +
                " turquoise, it's blinding colors will leave you in awe. I love watching\n" +
                " them swim around during golden hour when their vibrant colors show off\n" +
                " the most. Preferably kept in schools with other rainbow fish, in warm\n" +
                " temperature water.", "Claudia Barrales", "6/26/20", Collection<Hashtags>hashtags));


     @RequestMapping("blopPost/{postTitle}")
    public String showSinglePost(@PathVariable String postTitle, Model model) {
        model.addAttribute("blogPost", posts.get(postTitle));
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
}



