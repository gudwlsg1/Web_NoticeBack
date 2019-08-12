package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();
    int deleteById(Long id);
    Long add(Comment comment);
    int modify(Comment comment);
    Comment findById(Long id);
    List findByUserId(Long userId);
    List findByPostId(Long postId);
}