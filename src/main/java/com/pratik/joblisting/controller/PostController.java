package com.pratik.joblisting.controller;

import com.pratik.joblisting.repository.PostRepository;
import com.pratik.joblisting.model.Post;
import com.pratik.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// "post" here means job post
@RestController
@CrossOrigin(origins = "https://job2-lake.vercel.app")
public class PostController {

    @Autowired
    PostRepository repo;

    SearchRepository srepo;

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/posts/{texts}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text) {
        return srepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }
}

