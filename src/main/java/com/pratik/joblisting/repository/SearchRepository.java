package com.pratik.joblisting.repository;

import com.pratik.joblisting.model.Post;


import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
