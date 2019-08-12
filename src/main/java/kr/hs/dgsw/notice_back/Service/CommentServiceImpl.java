package kr.hs.dgsw.notice_back.Service;

import kr.hs.dgsw.notice_back.Domain.Comment;
import kr.hs.dgsw.notice_back.Domain.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> findAll() {
        return commentMapper.findAll();
    }

    @Override
    public int deleteById(Long id) {
        return this.commentMapper.deleteById(id);
    }

    @Override
    public Long add(Comment comment) {
        return this.commentMapper.add(comment);
    }

    @Override
    public int modify(Comment comment) {
        return 0;
    }

    @Override
    public Comment findById(Long id) {
        return null;
    }

    @Override
    public List findByUserId(Long userId) {
        return null;
    }

    @Override
    public List findByPostId(Long postId) {
        return this.commentMapper.findByPostId(postId);
    }
}