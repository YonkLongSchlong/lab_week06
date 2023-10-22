package yonk.dev.lab_week06.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yonk.dev.lab_week06.backend.entities.PostComment;
import yonk.dev.lab_week06.backend.repositories.PostCommentRepository;

import java.util.List;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;

    public void addPostComment(PostComment postComment){
        postCommentRepository.save(postComment);
    }

    public List<PostComment> getAllPostComment() {
        return postCommentRepository.findAll();
    }
}
