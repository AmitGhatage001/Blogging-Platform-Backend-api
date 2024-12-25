package com.blogging.api.service;

import com.blogging.api.model.PostDetails;
import com.blogging.api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public boolean addPost(PostDetails postDetails){
        if(postDetails.getPublishedDate()==null){
            postDetails.setPublishedDate(new Date());
        }
        postRepository.save(postDetails);
        return true;
    }
}
