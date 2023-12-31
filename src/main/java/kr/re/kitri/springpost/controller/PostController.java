package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j  // lombok 의 log 를 사용하기 위한 annotation
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> viewAllPosts() {
        log.debug("전체보기 요청 시작..");
        return postService.getAllPosts();
    }

    @GetMapping("posts/{postId}")
    public Post viewPostById(@PathVariable int postId) {
        return postService.getPostById(postId);
    }

    @DeleteMapping("posts/{postId}")
    public void removePost(@PathVariable int postId) {
        postService.removePost(postId);
    }

    @PostMapping("/posts")
    public Post registPost(@RequestBody Post post) {
        System.out.println(post);  // 차후 logging 으로 변경 필요
        return postService.setPost(post);
    }

    @PutMapping("/posts/{postId}")
    public Post updatePost(@PathVariable int postId, @RequestBody Post post) {
        System.out.println(post);
        post.setPostId(postId);
        return postService.updatePost(post);
    }
}
