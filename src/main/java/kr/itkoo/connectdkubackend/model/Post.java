package kr.itkoo.connectdkubackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import kr.itkoo.connectdkubackend.dto.post.PostResponseDTO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String name;

    private String imgUrl;

    public PostResponseDTO toResponse() {
        return new PostResponseDTO(this.id, this.title, this.name, this.imgUrl);
    }
}
