package me.june.demoweb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-04-04
 * Time: 23:00
 **/
@Controller
@RequiredArgsConstructor
@RequestMapping("/posts/{postId}")
public class CommentController {

    class PostNotFoundException extends RuntimeException{

    }

    private final CommentRepository comments;
    private final PostRepository posts;

    @ModelAttribute("post")
    public Post post(@PathVariable("postId") Long id) {
        return this.posts.findById(id).orElseThrow(PostNotFoundException::new);
    }

    @PostMapping("/comments")
    public String saveComments(Post post, @Valid Comment comment, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "";
        }
        comment.setPost(post);
        this.comments.save(comment);
        return "redirect:/posts/{postsId}";
    }
}
