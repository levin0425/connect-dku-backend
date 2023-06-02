package kr.itkoo.connectdkubackend.dto.post;

import lombok.Data;

@Data
public class MatchingRequestDTO {

    private String gender;

    private Long grade;

    private Long age;

    private String want;
}
