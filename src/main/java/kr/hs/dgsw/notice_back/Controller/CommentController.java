package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.Comment;
import kr.hs.dgsw.notice_back.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comment/{postId}")
    public List getProductComment(@PathVariable Long postId){
        return this.commentService.findByPostId(postId);
    }

    @PostMapping("/comment")
    public Long AddComment(@RequestBody Comment comment){
        return this.commentService.add(comment);
    }

    @DeleteMapping("/comment/{postId}")
    public int DeleteComment(@PathVariable Long postId){
        return this.commentService.deleteById(postId);
    }
}
