package kr.itkoo.connectdkubackend.dto.post;

import lombok.Data;

@Data
public class MissionResponseDTO {
    private Long missionid; //미션 id

    private String mission; //미션내용

    private Long score; //미션점수

    public MissionResponseDTO(Long missionid, String mission, Long score) {
        this.missionid = missionid;
        this.mission = mission;
        this.score = score;
    }
}