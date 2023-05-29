package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.dto.post.MissionResponseDTO;
import kr.itkoo.connectdkubackend.repository.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionService {
    private final MissionRepository missionRepository;

    public MissionResponseDTO findById(Long id) {
        return missionRepository.findById(id).orElseThrow().toResponse();
    }
}
