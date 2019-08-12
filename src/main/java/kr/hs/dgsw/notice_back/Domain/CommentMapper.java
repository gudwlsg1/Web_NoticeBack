package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Comment comment);
    int modify(Comment comment);
    Comment findById(@Param("id") Long id);
    List findByUserId(@Param("userId") Long userId);
    List findByPostId(@Param("postId") Long postId);
}