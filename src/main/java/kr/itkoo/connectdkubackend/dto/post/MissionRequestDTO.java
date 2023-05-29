package kr.itkoo.connectdkubackend.dto.post;

import lombok.Data;

@Data
public class MissionRequestDTO {


    private String mission; //미션내용

    private Long score; //미션점수
}
