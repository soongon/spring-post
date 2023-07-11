package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> viewAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("posts/{postId}")
    public Post viewPostById(@PathVariable int postId) {
        return postService.getPostById(postId);
    }

    @DeleteMapping("posts/{postId}")
    public String removePost(@PathVariable int postId) {
        return postService.removePost(postId);
    }
}
