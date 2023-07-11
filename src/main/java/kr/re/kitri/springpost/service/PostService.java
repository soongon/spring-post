package kr.re.kitri.springpost.service;

import kr.re.kitri.springpost.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public String getAllPosts() {
        return postRepository.selectAllPosts();
    }
}
