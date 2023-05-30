package com.tikkeul.app.domain.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MyjumoonDTO {
    private Long id;
    private String name;
    private String brand;
    private String status;
    private String deliveryStartDate;
    private Long itemId;
    private Long userId;


    private String fileOriginName;
    private String fileUuid;
    private String filePath;

}
