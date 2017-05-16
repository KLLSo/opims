package me.opims.service.impl;

import me.opims.dao.PostMapper;
import me.opims.model.Post;
import me.opims.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tb on 17-5-16.
 */
@Service("PostService")
public class PostServiceImpl implements PostService {

    @Resource
    private PostMapper postMapper;

    @Override
    public int addPost(Post post) {
        return postMapper.insertSelective(post);
    }

    @Override
    public Post getPost(Integer id) {
        return postMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePost(Post post) {
        return postMapper.updateByPrimaryKeySelective(post);
    }

    @Override
    public int deletePost(Integer id) {
        return postMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Post> getPostByContent(String content) {
        return postMapper.selectPosts(content);
    }
}
