package kr.re.kitri.springpost.repository;

import kr.re.kitri.springpost.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    public List<Post> selectAllPosts() {

        List<Post> posts = new ArrayList<>();
        posts.add(new Post(1, "첫번째 게시물", "안녕하세요", 0));
        posts.add(new Post(2, "두번째 게시물", "안녕하세요2", 12));
        posts.add(new Post(3, "세번째 게시물", "안녕하세요3", 34));

        return posts;
    }

    public Post selectPostById(int postId) {
        return new Post(postId, "테스트 게시물", "테스트", 10);
    }
}
