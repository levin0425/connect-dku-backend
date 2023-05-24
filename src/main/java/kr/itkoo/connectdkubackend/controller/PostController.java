package kr.itkoo.connectdkubackend.controller;

import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
import kr.itkoo.connectdkubackend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostController {

    private final PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<PostResponseDTO> select(@PathVariable Long id) {
        return ResponseEntity.ok(postService.findById(id));
    }
}
