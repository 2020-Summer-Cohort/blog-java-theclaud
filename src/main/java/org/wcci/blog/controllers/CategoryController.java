package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.storage.CategoryStorage;

@Controller
public class CategoryController {

   private CategoryStorage categoryStorage;

   public CategoryController(CategoryStorage categoryStorage){
       this.categoryStorage=categoryStorage;
   }

    @RequestMapping("category/{categoryTitle}")
    public String showSingleCategory(@PathVariable String categoryTitle, Model model) {
       model.addAttribute("category", categoryStorage.findCategoryByTitle(categoryTitle));
       return "category-template";
    }

    @RequestMapping("category")
    public String showAllCategories(Model model){
       model.addAttribute("category", categoryStorage.findAllCategories());
       return "category-template";
    }

}
