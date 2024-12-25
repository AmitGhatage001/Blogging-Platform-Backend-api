package com.blogging.api.controller;

import com.blogging.api.model.PostDetails;
import com.blogging.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping
    public boolean savePost(@RequestBody PostDetails postDetails){
        return postService.addPost(postDetails);
    }
}
