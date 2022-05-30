package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.Category;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.IBlogService;
import com.example.demo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("categoryList")
    public List<Category> setCategory(){
        List<Category> categoryList = categoryService.findAll();
        return categoryList;
    }

    @GetMapping("")
    public String getAllBlog(@RequestParam(defaultValue = "") String key_author,
                             @RequestParam(defaultValue = "") String key_category,
                             @PageableDefault(size = 2) Pageable pageable,
                             Model model){
        Page<Blog> blogs = blogService.getAllBlog(key_author, key_category, pageable);
        model.addAttribute("blogs", blogs);
        model.addAttribute("key_author", key_author);
        model.addAttribute("key_category", key_category);
        return "/list" ;
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        Blog blog = new Blog();
        blog.setCategory(new Category());
        model.addAttribute("blogs", blog);
        return "/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/{id}/update")
    public String showEdit(@PathVariable int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "/update";
    }

    @PostMapping("/update")
    public String edit(Blog blog){
        blogService.save(blog);
        return "redirect:/list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "/view";
    }

    @GetMapping("/{id}/delete")
    public String showDelete(@PathVariable int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "/update";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") int id){
        blogService.delete(id);
        return "redirect:/list";
    }

    @GetMapping("/sort")
    public String sortByReleaseDate(@PageableDefault(size = 2) Pageable pageable,Model model){
        Page<Blog> blogs=blogService.getAllBlogSortByReleaseDate(pageable);
        model.addAttribute("blogs",blogs);
        return "/list";
    }
}
