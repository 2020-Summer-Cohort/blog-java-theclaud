package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.wcci.blog.entities.BlogPost;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CategoryController {

    Map<String, BlogPost> posts = new HashMap<>();



}
