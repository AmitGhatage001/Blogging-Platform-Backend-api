package com.blogging.api.repository;

import com.blogging.api.model.PostDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<PostDetails,String> {
}
