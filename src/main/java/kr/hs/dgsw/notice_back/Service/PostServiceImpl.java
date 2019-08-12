package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Post;
import kr.hs.dgsw.notice_back.Domain.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostMapper postMapper;

    @Override
    public List<Post> findAll() {
        return postMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return postMapper.deleteById(id);
    }

    @Override
    public Long add(Post post) {
        return postMapper.add(post);
    }

    @Override
    public int modify(Post post) {
        return postMapper.modify(post);
    }

    @Override
    public List findByUserId(Long userId) {
        return postMapper.findByUserId(userId);
    }

    @Override
    public Object findByPostId(Long postId) {
        return postMapper.findByPostId(postId);
    }
}
