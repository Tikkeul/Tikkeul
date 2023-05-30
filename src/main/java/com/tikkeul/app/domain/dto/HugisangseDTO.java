package com.tikkeul.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class HugisangseDTO {

    private String score;
    private String content;
    private String registerDate;
    private String itemname;
    private String brand;
    private String username;
    private Long id;
    private Long orderId;


}

