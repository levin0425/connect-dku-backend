package kr.itkoo.connectdkubackend.repository;

import kr.itkoo.connectdkubackend.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {
    Optional<Mission> findById(Long id);
}