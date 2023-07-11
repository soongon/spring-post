package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.model.Post;
import kr.re.kitri.springpost.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts() {
        return postRepository.selectAllPosts();
    }

    public Post getPostById(int postId) {
        return postRepository.selectPostById(postId);
    }

    public String removePost(int postId) {
        return postRepository.deletePost(postId);
    }
}
