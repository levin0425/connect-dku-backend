package kr.itkoo.connectdkubackend.dto.post;

import lombok.Data;

@Data
public class PostResponseDTO {
    private Long id;

    private String title;

    private String name;

    private String imgUrl;

    public PostResponseDTO(Long id, String title, String name, String imgUrl) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.imgUrl = imgUrl;
    }
}
