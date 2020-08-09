package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.storage.repository.BlogPostRepository;
import org.wcci.blog.entities.BlogPost;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BlogPostStorage {

    Map<String, BlogPost> posts = new HashMap<>();


    BlogPost post1 = new BlogPost("Angel Fish", "Angel Fish are graceful when they're swimming around.I enjoy watching\n" +
            " them move around and show off their fins, the way they flow with the\n" +
            " water is magical to see. The Angel fish grows to be 8 inches big and\n" +
            " they vary in pattern The Marbled Angel has a mix of black,blue and\n" +
            " gray. A classic must have for your growing aquarium.", "Leia Alderran", "06/26/20", hashtag1, hashtag2));

    BlogPost post2 = new BlogPost("Kamaka Fish", "The Kamaka Rainbow fish are known for their impeccable, colorful\n" +
            " pattern on it's scales. With many hints of blue, from sky blue to\n" +
            " turquoise, it's blinding colors will leave you in awe. I love watching\n" +
            " them swim around during golden hour when their vibrant colors show off\n" +
            " the most. Preferably kept in schools with other rainbow fish, in warm\n" +
            " temperature water.", "Claudia Barrales", "6/26/20", Hashtags...hashtags));

        posts.put(post1.getTitle(), post1);
        posts.put(post1.getTitle(), post2);



    public BlogPost findBlogPostByPostTitle(String postTitle) {
        return posts.get(postTitle);
    }

    public Collection<BlogPost> findAllBlogPosts() {
        return posts.values();
    }
}



