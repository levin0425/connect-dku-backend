package kr.itkoo.connectdkubackend.controller;

import kr.itkoo.connectdkubackend.dto.post.MissionResponseDTO;
import kr.itkoo.connectdkubackend.service.MissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/Mission")
public class MissionController {

    private final MissionService postService;

    @GetMapping("/{missionid}")
    public ResponseEntity<MissionResponseDTO> select(@PathVariable Long missionid) {
        return ResponseEntity.ok(postService.findById(missionid));
    }
}