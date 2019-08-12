package kr.hs.dgsw.notice_back.Domain;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    int deleteById(@Param("id") Long id);
    Long add(Post product);
    int modify(Post product);
    List findByUserId(@Param("userId")Long userId);
    Object findByPostId(@Param("postId")Long postId);
}
