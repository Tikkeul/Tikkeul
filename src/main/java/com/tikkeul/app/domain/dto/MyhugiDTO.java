package com.tikkeul.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MyhugiDTO {

    private Long ok;
    private Long ik;
    private Long orderAmount;
    private Long itemId;
    private int price;
    private String name;
    private String deliveryStartDate;
}
