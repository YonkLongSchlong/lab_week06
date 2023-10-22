package yonk.dev.lab_week06.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import yonk.dev.lab_week06.backend.entities.Post;
import yonk.dev.lab_week06.backend.repositories.PostRepository;
import yonk.dev.lab_week06.backend.services.PostService;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String getAllPost(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "post/posts";
    }
}
