package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import kr.itkoo.connectdkubackend.dto.post.MissionResponseDTO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission {
    @Id
    @GeneratedValue
    private Long missionid; //미션 id

    private String mission; //미션내용

    private Long score; //미션점수



    public MissionResponseDTO toResponse() {
        return new MissionResponseDTO(this.missionid, this.mission, this.score);
    }
}