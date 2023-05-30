package com.tikkeul.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class GumaehugiDTO {

    private Long id;
    private Long orderId;
    private Long userId;
    private String registerDate;
    private String content;

}
