package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.Post;
import kr.hs.dgsw.notice_back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/post")
    public List getPostList(){
        return this.postService.findAll();
    }

    @GetMapping("/post/{postId}")
    public Object getPost(@PathVariable Long postId){
        return this.postService.findByPostId(postId);
    }

    @GetMapping("/post/user/{userId}")
    public List getPostListByUser(@PathVariable Long userId){
        return this.postService.findByUserId(userId);
    }

    @PostMapping("/post")
    public Long addPost (@RequestBody Post post){
        return this.postService.add(post);
    }

    @PutMapping("/post")
    public int editPost (@RequestBody Post post){
        return this.postService.modify(post);
    }

    @DeleteMapping("/post/{postId}")
    public int deletePost(@PathVariable Long postId){
        return this.postService.deleteById(postId);
    }
}
