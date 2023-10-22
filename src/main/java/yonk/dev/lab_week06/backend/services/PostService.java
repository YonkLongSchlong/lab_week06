package yonk.dev.lab_week06.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yonk.dev.lab_week06.backend.entities.Post;
import yonk.dev.lab_week06.backend.repositories.PostRepository;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }
}
