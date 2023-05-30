package com.tikkeul.app.domain.dto;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class DoranbangDTO {
    private Long id;
    private String title;
    private String registerdate;
    private String userId;
    private String name;
}
