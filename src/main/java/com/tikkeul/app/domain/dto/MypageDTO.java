package com.tikkeul.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MypageDTO {
    private Long id;
    private String name;
    private Long savinglevelId;
    private int orderCount;
    private int likeCount;
}
