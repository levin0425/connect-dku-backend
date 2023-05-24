package kr.itkoo.connectdkubackend.dto.post;

import lombok.Data;

@Data
public class PostRequestDTO {
    private String title;

    private String name;

    private String imgUrl;
}
