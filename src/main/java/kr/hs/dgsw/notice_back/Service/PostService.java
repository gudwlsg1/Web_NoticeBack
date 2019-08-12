package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface PostService {
    List<Post> findAll();
    int deleteById(Long id);
    Long add(Post product);
    int modify(Post product);
    List findByUserId(Long userId);
    Object findByPostId(Long postId);
}
