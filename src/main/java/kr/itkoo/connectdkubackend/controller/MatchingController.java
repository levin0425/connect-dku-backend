package kr.itkoo.connectdkubackend.controller;

import kr.itkoo.connectdkubackend.dto.post.MatchingResponseDTO;
import kr.itkoo.connectdkubackend.service.MatchingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/matching")
public class MatchingController {

    private final MatchingService postService;
    @GetMapping("/{matching}")

    public ResponseEntity<MatchingResponseDTO> select(@PathVariable Long matchingid) {
        return ResponseEntity.ok(postService.findById(matchingid));
    }
}
