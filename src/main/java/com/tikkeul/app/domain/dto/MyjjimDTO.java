package com.tikkeul.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MyjjimDTO {
    private Long id;
    private String cartegory;
    private String name;
    private String brand;
    private int price;
    private Long itemId;
    private Long orderId;
    private Long likesId;
    private Long userId;
    private Long jjimreviewCount;
}
