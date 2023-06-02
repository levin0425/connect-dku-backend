package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import kr.itkoo.connectdkubackend.dto.post.MatchingResponseDTO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Matching {
    @Id
    @GeneratedValue
    private Long matchingid; //매칭 결과 팀 번호

    private String gender;

    private Long grade;

    private Long age;

    private String want; //원하는 멘토멘티 상

    public MatchingResponseDTO toResponse() {return new MatchingResponseDTO(this.matchingid, this. gender, this. grade, this. age, this. want);}
}
