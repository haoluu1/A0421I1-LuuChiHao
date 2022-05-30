package com.example.demo.service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Blog findById(int id);
    void save(Blog blog);
    void edit(Blog blog);
    void delete(int id);
    Page<Blog> getAllBlog(String author, String category, Pageable pageable);
    Page<Blog> getAllBlogSortByReleaseDate(Pageable pageable);
}
