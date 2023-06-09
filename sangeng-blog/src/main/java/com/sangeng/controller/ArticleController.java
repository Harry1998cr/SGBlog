package com.sangeng.controller;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;
import com.sangeng.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    @GetMapping("/list")
//    public List<Article> test(){
//        return articleService.list();
//    }
    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList(){
        //查询热门文章 封装成ResopnseResult
        ResponseResult result = articleService.hotArticleList();
        return result;
    }

    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId){
        ResponseResult result = articleService.articleList(pageNum, pageSize, categoryId);
        return result;
    }

    @GetMapping("/{id}")
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        ResponseResult result = articleService.getArticleDetail(id);
        return result;
    }

    @PutMapping("updateViewCount/{id}")
    public ResponseResult updateViewCount(@PathVariable("id") Long id){
        ResponseResult result = articleService.updateViewCount(id);
        return result;
    }
}
