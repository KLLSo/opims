package me.opims.service.impl;

import me.opims.dao.CommentMapper;
import me.opims.dao.FirmMapper;
import me.opims.entity.CommentDTO;
import me.opims.model.Comment;
import me.opims.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tb on 17-5-16.
 */
@Service("CommentService")
public class CommentServiceImpl implements CommentService{

    @Resource
    private CommentMapper commentMapper;

    @Resource
    private FirmMapper firmMapper;

    @Override
    public List<Comment> getCommentsByContent(String content) {
        return commentMapper.selectAllCommentsByContent(content);
    }

    @Override
    public int deleteComment(Integer id) {
        Comment comment =commentMapper.selectByPrimaryKey(id);
        if(comment == null){
            return 0;
        }
        comment.setIsDelete((byte) 1);
        return commentMapper.updateByPrimaryKey(comment);
    }

    @Override
    public List<CommentDTO<Comment>> getCommentsByUserName(String userName) {
        List<Comment> comments = commentMapper.selectAllCommentByUserName(userName);
        List<CommentDTO<Comment>> commentDTOS = new ArrayList<>();
        for(Comment comment : comments){
            CommentDTO<Comment> commentDTO = firmMapper.selectCommentInfo(comment.getIdJob());
            commentDTO.setT(comment);
            commentDTOS.add(commentDTO);
        }

        return commentDTOS;
    }
}
