package kr.itkoo.connectdkubackend.service;

import kr.itkoo.connectdkubackend.dto.post.MatchingResponseDTO;
import kr.itkoo.connectdkubackend.repository.MatchingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatchingService {
    private final MatchingRepository matchingRepository;

    public MatchingResponseDTO findById(Long id) {
        return matchingRepository.findById(id).orElseThrow().toResponse();
    }
}
