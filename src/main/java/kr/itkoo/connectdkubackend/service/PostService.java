package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
import kr.itkoo.connectdkubackend.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public PostResponseDTO findById(Long id) {
        return postRepository.findById(id).orElseThrow().toResponse();
    }
}
