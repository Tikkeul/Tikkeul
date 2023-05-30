package com.tikkeul.app.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MyjumooncancelDTO {

    private String name;
    private String address;
    private String phonenumber;
    private int price;
    private String itemname;
    private String status;
    private String brand;
    private Long id;
    private int currentStock;
    private int finalPayCount;
    private int orderAmount;
    private String deliveryStartDate;
    private String orderCancelDate;
    private String payStatus;

}
