package kr.re.kitri.springpost.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class PostRepository {

    public String selectAllPosts() {
        return "전체 글 목록 입니다.";
    }
}
