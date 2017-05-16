package me.opims.service;

import me.opims.entity.CommentDTO;
import me.opims.model.Comment;

import java.util.List;

/**
 * Created by tb on 17-5-16.
 */
public interface CommentService {

    List<Comment> getCommentsByContent(String Content);

    int deleteComment(Integer id);

    List<CommentDTO<Comment>> getCommentsByUserName(String userName);
}
