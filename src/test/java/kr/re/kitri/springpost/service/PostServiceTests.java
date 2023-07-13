package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostServiceTests {

    @Autowired
    private PostService postService;

    @Test
    public void testGetAllPosts() {
        List<Post> posts = postService.getAllPosts();
        // 결과가 널이 아니면 성공
        //Assertions.assertNotNull(posts);
        // 결과가 0보다 크면 성공
        Assertions.assertTrue(posts.size() > 0);
    }

    @Test
    public void testGetPostById() {
        Post post = postService.getPostById(1);
        Assertions.assertNotNull(post);
    }
}
