package kr.itkoo.connectdkubackend.dto.post;

import lombok.Data;

@Data
public class MatchingResponseDTO {
    private Long matchingid;

    private String gender;

    private Long grade;

    private Long age;

    private String want;

    public MatchingResponseDTO(Long matchingid, String gender, Long grade, Long age, String want) {
        this.matchingid = matchingid;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.want = want;
    }

}
