package com.tikkeul.app.domain.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class HugisujungDTO {

    private Long id;
    private String content;

}
