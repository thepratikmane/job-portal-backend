package com.pratik.joblisting.repository;
// this java file will be used to fetch data
import com.pratik.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
