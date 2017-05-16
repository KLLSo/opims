package me.opims.service;

import me.opims.model.Post;

import java.util.List;

/**
 * Created by tb on 17-5-16.
 */
public interface PostService {

    int addPost(Post post);

    Post getPost(Integer id);

    int updatePost(Post post);

    int deletePost(Integer id);

    List<Post> getPostByContent(String content);
}
