package kr.re.kitri.springpost.controller;

import kr.re.kitri.springpost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public String viewAllPosts() {
        return postService.getAllPosts();
    }
}
